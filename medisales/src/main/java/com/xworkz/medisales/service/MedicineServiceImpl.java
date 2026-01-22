package com.xworkz.medisales.service;

import com.xworkz.medisales.dao.MedicineDAO;
import com.xworkz.medisales.dto.MediSalesDTO;
import com.xworkz.medisales.entity.MediSalesEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineDAO dao;

    @Override
    public boolean validateAndSave(MediSalesDTO dto) {

        if (dto == null) {
            System.err.println("DTO is null");
            return false;
        }

        boolean isInvalid = false;

        if (dto.getMedicineName() == null || dto.getMedicineName().isEmpty()) {
            System.err.println("Invalid medicine name");
            isInvalid = true;
        }

        if (dto.getPrice() <= 0) {
            System.err.println("Invalid price");
            isInvalid = true;
        }

        if (dto.getExpDate() == null || dto.getExpDate().isEmpty()) {
            System.err.println("Invalid expiry date");
            isInvalid = true;
        }

        if (dto.getMg() == null || dto.getMg().isEmpty()) {
            System.err.println("Invalid mg");
            isInvalid = true;
        }

        if (dto.getCombination() == null || dto.getCombination().isEmpty()) {
            System.err.println("Invalid combination");
            isInvalid = true;
        }

        if (isInvalid) {
            return false;
        }

    MediSalesEntity entity=new MediSalesEntity();
            BeanUtils.copyProperties(dto,entity);

        return dao.save(entity);
    }

    @Override
    public Optional<MediSalesEntity> getMedicineName(String medicineName) {

        if (medicineName == null || medicineName.isEmpty()) {
            return Optional.empty();
        }

        return dao.getMedicineName(medicineName);
    }

    @Override
    public Optional<MediSalesDTO> getMedicineId(int medicineId) {

        if (medicineId <= 0) {
            System.err.println("Invalid medicine id");
            return Optional.empty();
        }
        Optional<MediSalesEntity> mediSalesEntity=dao.findById(medicineId);
        MediSalesDTO mediSalesDTO = new MediSalesDTO();
        BeanUtils.copyProperties(mediSalesEntity.get(),mediSalesDTO);
        return Optional.of(mediSalesDTO);
    }

    @Override
    public boolean updateMedicine(MediSalesDTO dto) {

        if (dto == null || dto.getId() <= 0) {
            System.err.println("Invalid DTO or ID");
            return false;
        }

        boolean isInvalid = false;

        if (dto.getMedicineName() == null || dto.getMedicineName().isEmpty()) {
            System.err.println("Invalid medicine name");
            isInvalid = true;
        }

        if (dto.getPrice() <= 0) {
            System.err.println("Invalid price");
            isInvalid = true;
        }

        if (dto.getExpDate() == null || dto.getExpDate().isEmpty()) {
            System.err.println("Invalid expiry date");
            isInvalid = true;
        }

        if (dto.getMg() == null || dto.getMg().isEmpty()) {
            System.err.println("Invalid mg");
            isInvalid = true;
        }

        if (dto.getCombination() == null || dto.getCombination().isEmpty()) {
            System.err.println("Invalid combination");
            isInvalid = true;
        }

        if (isInvalid) {
            return false;
        }
        MediSalesEntity entity=new MediSalesEntity();
        BeanUtils.copyProperties(dto,entity);

        return dao.save(entity);
    }

    @Override
    public boolean delete(int id) {

        if (id <= 0) {
            System.err.println("Invalid id for delete");
            return false;
        }

        return dao.deleteById(id);
    }
}
