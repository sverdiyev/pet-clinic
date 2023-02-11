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

  public DataLoader(OwnerServiceMap ownerServiceMap, VetServiceMap vetServiceMap) {
    this.ownerServiceMap = ownerServiceMap;
    this.vetServiceMap = vetServiceMap;
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner = new Owner();
    owner.setFirstName("sasha");
    owner.setLastName("verd");

    ownerServiceMap.save(owner);

    Vet vet = new Vet();
    vet.setFirstName("sasha");
    vet.setLastName("verd");

    vetServiceMap.save(vet);

    System.out.println("LOADING");
  }
}
