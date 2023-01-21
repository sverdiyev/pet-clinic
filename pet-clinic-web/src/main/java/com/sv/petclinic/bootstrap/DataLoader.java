package com.sv.petclinic.bootstrap;

import com.sv.petclinic.model.Owner;
import com.sv.petclinic.model.Vet;
import com.sv.petclinic.services.map.OwnerServiceMap;
import com.sv.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServiceMap ownerServiceMap;
    private final VetServiceMap vetServiceMap;

    public DataLoader() {
        this.ownerServiceMap = new OwnerServiceMap();
        this.vetServiceMap = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setFirstName("sasha");
        owner.setLastName("verd");
        owner.setId(1L);

        ownerServiceMap.save(owner);

        Vet vet = new Vet();
        vet.setFirstName("sasha");
        vet.setLastName("verd");
        vet.setId(2L);

        vetServiceMap.save(vet);
    }
}
