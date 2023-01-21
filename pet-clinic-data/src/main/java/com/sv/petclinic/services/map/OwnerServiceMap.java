package com.sv.petclinic.services.map;

import com.sv.petclinic.model.Owner;
import com.sv.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Long id, Owner obj) {
        return super.save(id, obj);
    }

    @Override
    public boolean delete(Owner obj) {
        return super.delete(obj);
    }

    @Override
    public boolean deleteById(Long id) {
        return super.deleteById(id);
    }
}
