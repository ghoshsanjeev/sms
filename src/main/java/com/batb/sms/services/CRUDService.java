package com.batb.sms.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CRUDService<T> {

    private JpaRepository<T, Long> repo;

    public List<T> getAll(){
	return repo.findAll();
    }

    public abstract T getById(int id);

    public T create(T obj){
	return repo.save(obj);
    }

    public T update(T obj){
	return repo.saveAndFlush(obj);
    }

    public void remove(T obj){
	repo.delete(obj);;
    }

}
