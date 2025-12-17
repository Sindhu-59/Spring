package com.xworkz.beauty.service.impl;

import com.xworkz.beauty.dto.BeautyProductDTO;
import com.xworkz.beauty.dao.BeautyProductDAO;
import com.xworkz.beauty.service.BeautyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeautyProductServiceImpl implements BeautyProductService {

    @Autowired
    private BeautyProductDAO beautyProductDAO;
    @Override
    public boolean validateAndSave(BeautyProductDTO beautyProductDTO) {
        boolean saved= beautyProductDAO.save(beautyProductDTO);
        return saved;
    }
}
