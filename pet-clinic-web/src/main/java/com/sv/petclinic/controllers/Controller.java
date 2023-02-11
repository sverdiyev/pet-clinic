package com.sv.petclinic.controllers;

import com.sv.petclinic.model.Owner;
import com.sv.petclinic.model.Vet;
import com.sv.petclinic.services.map.OwnerServiceMap;
import com.sv.petclinic.services.map.VetServiceMap;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


  private final OwnerServiceMap ownerServiceMap;
  private final VetServiceMap vetServiceMap;

  public Controller(OwnerServiceMap ownerServiceMap, VetServiceMap vetServiceMap) {
    this.ownerServiceMap = ownerServiceMap;
    this.vetServiceMap = vetServiceMap;
  }

  @GetMapping("/vets")
  public Set<Vet> getAllVets() {
    return vetServiceMap.findAll();

  }

  @GetMapping("/owners")
  public Set<Owner> getAllOwners() {
    return ownerServiceMap.findAll();

  }
}
