package com.sv.petclinic.model;

import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class PetType extends BaseEntity {

  private String name;
}
