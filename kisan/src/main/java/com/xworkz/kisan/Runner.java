package com.xworkz.kisan;

import com.xworkz.kisan.core.CoreConfig;
import com.xworkz.kisan.dto.KisanDTO;
import com.xworkz.kisan.service.KisanService;
import com.xworkz.kisan.service.impl.KisanServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

        public static void main(String[] args) {
            ApplicationContext ap=new AnnotationConfigApplicationContext(CoreConfig.class);
            KisanDTO kisanDTO=new KisanDTO();
            kisanDTO.setName("Siya");
            kisanDTO.setPhone("887677577");
            kisanDTO.setPlace("Shimoga");
            kisanDTO.setUserType("Farmer");
            System.out.println("The farmer details"+kisanDTO);
            KisanService service=ap.getBean(KisanService.class);
            service.validAndSave(kisanDTO);
        }
    }

