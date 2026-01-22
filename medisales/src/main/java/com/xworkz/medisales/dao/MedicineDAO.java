package com.xworkz.medisales.dao;

import com.xworkz.medisales.dto.MediSalesDTO;
import com.xworkz.medisales.entity.MediSalesEntity;

import java.util.Optional;

public interface MedicineDAO {

     boolean save(MediSalesEntity entity);

    public boolean update(MediSalesEntity entity);



    Optional<MediSalesEntity> findById(int medicineId);

    boolean deleteById(int id);

    Optional<MediSalesEntity> findByName(String medicineName);

    Optional<MediSalesEntity> getMedicineName(String medicineName);
}
