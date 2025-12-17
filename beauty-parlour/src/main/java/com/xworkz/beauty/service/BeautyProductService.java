package com.xworkz.beauty.service;

import com.xworkz.beauty.dto.BeautyProductDTO;

public interface BeautyProductService {

    boolean validateAndSave(BeautyProductDTO beautyProductDTO);
}
