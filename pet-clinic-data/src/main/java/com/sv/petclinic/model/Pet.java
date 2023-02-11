package com.sv.petclinic.model;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Pet extends BaseEntity {

  @ManyToOne
  private PetType petType;
  @ManyToOne
  private Owner owner;
  private LocalDate birthDay;

  //want the visit to remain if the pet is deleted
  @OneToMany(mappedBy = "pet", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
  private Set<Visit> visits;
}
