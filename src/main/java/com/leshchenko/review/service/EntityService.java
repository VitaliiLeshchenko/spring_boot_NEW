package com.leshchenko.review.service;

import java.util.List;

public interface EntityService<E> {
    E getOne(long id);
    
    List<E> findAll();

    E save(E entity);

    void deleteById(long id);
}
