package com.sv.petclinic.services.map;

import com.sv.petclinic.model.Owner;
import com.sv.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
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
