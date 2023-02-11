package com.sv.petclinic.services.map;

import com.sv.petclinic.model.Vet;
import com.sv.petclinic.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet> implements VetService {

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet save(Vet owner) {
    return super.save(owner);
  }

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public boolean delete(Vet obj) {
    return super.delete(obj);
  }

  @Override
  public boolean deleteById(Long id) {
    return super.deleteById(id);
  }
}
