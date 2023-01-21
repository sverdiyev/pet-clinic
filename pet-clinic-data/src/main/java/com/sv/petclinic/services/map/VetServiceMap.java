package com.sv.petclinic.services.map;

import com.sv.petclinic.model.Vet;
import com.sv.petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Long id, Vet obj) {
        return super.save(id, obj);
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
