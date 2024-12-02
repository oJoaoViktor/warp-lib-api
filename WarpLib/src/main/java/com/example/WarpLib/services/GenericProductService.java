package com.example.WarpLib.services;

import java.util.List;
import java.util.Optional;

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
            return repository.save(updatedEntity);
        });
    }

    public boolean delete (Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
