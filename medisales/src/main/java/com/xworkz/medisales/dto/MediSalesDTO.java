package com.xworkz.medisales.dto;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MediSalesDTO {

    private int id;

    private String medicineName;

    private double price;

    private String combination;

    private String expDate;

    private String mg;
}
