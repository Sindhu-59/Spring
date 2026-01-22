package com.xworkz.medisales.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medicine")
public class MediSalesEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String medicineName;

    @Column(name = "price")
    private double price;

    @Column(name = "combination")
    private String combination;

    @Column(name = "expdate")
    private String expDate;

    @Column(name = "mg")
    private String mg;
}

