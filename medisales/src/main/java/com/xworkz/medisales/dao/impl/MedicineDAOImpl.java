package com.xworkz.medisales.dao.impl;

import com.xworkz.medisales.dao.MedicineDAO;

import com.xworkz.medisales.entity.MediSalesEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Optional;

public class MedicineDAOImpl implements MedicineDAO {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(MediSalesEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }


    @Override
    public boolean update(MediSalesEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public Optional<MediSalesEntity> findById(int medicineId) {
        EntityManager manager=entityManagerFactory.createEntityManager();
        MediSalesEntity entity = manager.find(MediSalesEntity.class,medicineId);
        manager.close();
        if(entity==null){
            return Optional.empty();
        }
        return Optional.of(entity);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }


    @Override
    public Optional<MediSalesEntity> findByName(String medicineName) {

        EntityManager em = entityManagerFactory.createEntityManager();

        MediSalesEntity entity = em.find(MediSalesEntity.class, medicineName);

        em.close();

        if (entity == null) {
            return Optional.empty();
        }

        return Optional.of(entity);
    }

    @Override
    public Optional<MediSalesEntity> getMedicineName(String medicineName) {
        return Optional.empty();
    }


}
