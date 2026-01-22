package com.xworkz.medisales.service;

import com.xworkz.medisales.dto.MediSalesDTO;
import com.xworkz.medisales.entity.MediSalesEntity;

import java.util.Optional;

public interface MedicineService {

    boolean validateAndSave(MediSalesDTO dto);

    Optional<MediSalesEntity> getMedicineName(String medicineName);

    Optional<MediSalesDTO> getMedicineId(int medicineId);

    boolean updateMedicine(MediSalesDTO dto);

    boolean delete(int id);
}
