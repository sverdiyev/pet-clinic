package com.sv.petclinic.services.map;

import com.sv.petclinic.model.PetType;
import com.sv.petclinic.services.PetTypeService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType> implements PetTypeService {

  @Override
  public PetType findById(Long id) {
    return super.findById(id);
  }

  @Override
  public PetType save(PetType owner) {
    return super.save(owner);
  }

  @Override
  public Set<PetType> findAll() {
    return super.findAll();
  }


  @Override
  public boolean delete(PetType obj) {
    return super.delete(obj);
  }

  @Override
  public boolean deleteById(Long id) {
    return super.deleteById(id);
  }
}
