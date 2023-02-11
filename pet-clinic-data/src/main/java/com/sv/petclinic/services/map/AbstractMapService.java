package com.sv.petclinic.services.map;

import com.sv.petclinic.model.BaseEntity;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity> {

  protected Map<Long, T> map = new HashMap<>();


  Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  T findById(Long id) {
    return map.get(id);
  }


  T save(T obj) {

    if (obj.getId() == null) {
      var newObj = handleObjWithNoId(obj);
      return map.put(newObj.getId(), newObj);
    }

    return map.put(obj.getId(), obj);
  }

  boolean delete(T obj) {
    return map.values().remove(obj);
  }

  boolean deleteById(Long id) {
    return map.remove(id) != null;
  }


  private T handleObjWithNoId(T obj) {
    var id = getNextId();
    obj.setId(id);
    return obj;
  }

  public Long getNextId() {

    System.out.println(map.isEmpty());
    if (map.isEmpty()) {
      return 1L;
    }

    System.out.println(Collections.max(map.keySet()));
    return Collections.max(map.keySet()) + 1;
  }
}
