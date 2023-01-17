package com.sv.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T> {

    protected Map<Long, T> map = new HashMap<>();


    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(Long id) {
        return map.get(id);
    }

    T save(Long id, T obj) {

        return map.put(id, obj);
    }

    boolean delete(T obj) {
        return map.values().remove(obj);
    }

    boolean deleteById(Long id) {
        return map.remove(id) != null;
    }
}
