package com.sv.petclinic.services.map;

import com.sv.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity> {

    protected Map<Long, T> map = new HashMap<>();


    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(Long id) {
        return map.get(id);
    }

    T save(Long id, T obj) {

        if (obj.getId() == null)
            return map.put(getNextId(), obj);

        return map.put(id, obj);
    }

    T save(T obj) {

        if (obj.getId() == null)
            return map.put(getNextId(), obj);

        return map.put(obj.getId(), obj);
    }

    boolean delete(T obj) {
        return map.values().remove(obj);
    }

    boolean deleteById(Long id) {
        return map.remove(id) != null;
    }

    public Long getNextId() {
        return Collections.max(map.keySet()) + 1;
    }
}
