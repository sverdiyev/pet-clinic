package com.sv.petclinic.services.map;

import com.sv.petclinic.model.Pet;
import com.sv.petclinic.services.PetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet> implements PetService {

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Pet save(Pet owner) {
    return super.save(owner);
  }

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }


  @Override
  public boolean delete(Pet obj) {
    return super.delete(obj);
  }

  @Override
  public boolean deleteById(Long id) {
    return super.deleteById(id);
  }
}
