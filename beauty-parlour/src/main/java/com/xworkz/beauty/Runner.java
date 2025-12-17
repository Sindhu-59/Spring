package com.xworkz.beauty;

import com.xworkz.beauty.config.BeautyConfig;
import com.xworkz.beauty.dto.BeautyProductDTO;
import com.xworkz.beauty.service.BeautyProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(BeautyConfig.class);

        BeautyProductDTO beautyProductDTO=new BeautyProductDTO();
        beautyProductDTO.setId(1);
        beautyProductDTO.setCategory("Haircut and facial");
        beautyProductDTO.setName("HairClip");
        beautyProductDTO.setBrand("Amazon");
        beautyProductDTO.setDescription("Nothing");

        BeautyProductService service=context.getBean(BeautyProductService.class);
        service.validateAndSave(beautyProductDTO);
    }
}
