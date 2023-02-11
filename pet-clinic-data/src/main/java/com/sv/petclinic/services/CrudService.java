package com.sv.petclinic.services;

import java.util.Set;

public interface CrudService<T> {

  T findById(Long id);

  boolean delete(T object);

  boolean deleteById(Long id);

  T save(T owner);

  Set<T> findAll();
}
