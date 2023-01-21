package com.sv.petclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    private LocalDate date;
    private Pet pet;
    private String description;

}
