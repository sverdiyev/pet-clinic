package com.sv.petclinic.services;

import java.util.Set;

public interface CrudService<T> {

    T findById(Long id);

    T findByLastName(String lastName);

    T save(T owner);

    Set<T> findAll();
}
