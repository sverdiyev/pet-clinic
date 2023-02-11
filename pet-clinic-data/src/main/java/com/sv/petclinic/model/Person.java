package com.sv.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
public class Person extends BaseEntity {

  @Column(name = "first_name") //it defaults to snake case anyway, just showing as an example
  private String firstName;
  private String lastName;

}
