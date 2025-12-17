package com.xworkz.beauty.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeautyProductDTO {

    private int id;
    private String name;
    private String brand;
    private double price;
    private String category;
    private String description;
}
