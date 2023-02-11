package com.sv.petclinic.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Vet extends Person {

  private String specialty;


  //want the visit to remain if the pet is deleted
  @OneToMany(mappedBy = "vet", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
  private Set<Visit> visits;
}
