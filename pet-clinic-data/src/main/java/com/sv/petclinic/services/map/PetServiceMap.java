package com.sv.petclinic.services.map;

import com.sv.petclinic.model.Pet;
import com.sv.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet> implements CrudService<Pet> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Long id, Pet obj) {
        return super.save(id, obj);
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
