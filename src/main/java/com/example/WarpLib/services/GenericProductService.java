package com.example.WarpLib.services;

import java.util.List;
import java.util.Optional;
import java.lang.reflect.Field;


import org.springframework.data.jpa.repository.JpaRepository;

//<T> Genéricos: Permitem criar classes, métodos ou interfaces que funcionam com qualquer tipo de objeto
//Nesse caso estou criando um serviço e um controlador que podem operar com qualquer subtipo de produto, reduzindo a duplicação de código
public abstract class GenericProductService<T> {
    private final JpaRepository<T, Long> repository;

    public GenericProductService(JpaRepository<T, Long> repository){
        this.repository = repository;
    }

    public List<T> getAll(){
        return repository.findAll();
    }

    public Optional<T> getById(Long id){
        return repository.findById(id);
    }

    public T create(T entity){
        return repository.save(entity);
    }

    public Optional<T> update(Long id, T updatedEntity){
        return repository.findById(id).map(existingEntity -> {
            copyFields(updatedEntity, existingEntity);
            return repository.save(existingEntity);
        });
    }

    public boolean delete (Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

private void copyFields(T source, T target) {
    Class<?> clazz = source.getClass();

    // Itera por todos os campos da classe
    while (clazz != null) { // Inclui campos de superclasses
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true); // Permite acessar campos privados
            try {
                // Ignorar o campo "id" (ou qualquer outro que não deve ser copiado)
                if (field.getName().equalsIgnoreCase("id")) {
                    continue;
                }

                // Copiar o valor do campo de `source` para `target`
                Object value = field.get(source);
                field.set(target, value);
            } catch (IllegalAccessException e) {
                // Tratar exceções de acesso aos campos
                throw new RuntimeException("Erro ao copiar o campo: " + field.getName(), e);
            }
        }
        clazz = clazz.getSuperclass(); // Move para a superclasse
    }
}

}

