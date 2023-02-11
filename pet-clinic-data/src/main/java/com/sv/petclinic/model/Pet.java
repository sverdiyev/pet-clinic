package com.sv.petclinic.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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

}
