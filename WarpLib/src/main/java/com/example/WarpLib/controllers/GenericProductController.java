package com.example.WarpLib.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.WarpLib.services.GenericProductService;

import jakarta.validation.Valid;

public abstract class GenericProductController<T> {
    private final GenericProductService<T> service;

    public GenericProductController(GenericProductService<T> service){
        this.service = service;
    }

    //Retorna todos os registros 
    @GetMapping
    public ResponseEntity<List<T>> getAll(){
        List<T> entities = service.getAll();
        return entities.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(entities);
    }

    //Retorna um registro específico pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable Long id){
        return service.getById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    //Cria um novo registro
    @PostMapping
    public ResponseEntity<T> create(@RequestBody @Valid T entity){
        T createdEntity = service.create(entity);
        return ResponseEntity.status(201).body(createdEntity);
    }

    //Atualiza um registro existente
    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable Long id, @RequestBody T updatedEntity){
        return service.update(id, updatedEntity)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    //Remove um registro pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        if (service.delete(id)) {
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
