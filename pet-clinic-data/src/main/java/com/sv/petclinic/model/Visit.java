package com.sv.petclinic.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Visit extends BaseEntity {

  private LocalDate date;
  @ManyToOne
  private Pet pet;

  @ManyToOne
  private Owner owner;

  @ManyToOne
  private Vet vet;
  private String description;

}
