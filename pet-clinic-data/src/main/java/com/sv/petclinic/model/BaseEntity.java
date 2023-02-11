package com.sv.petclinic.model;

//tutor implemented Serializable, I do not know if it is required at the moment, so omit it
public class BaseEntity {

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
