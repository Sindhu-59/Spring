package com.xworkz.beauty.dao.impl;

import com.xworkz.beauty.dto.BeautyProductDTO;
import com.xworkz.beauty.DBConst;
import com.xworkz.beauty.dao.BeautyProductDAO;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class BeautyProductDAOImpl implements BeautyProductDAO {


    @Override
    public boolean save(BeautyProductDTO beautyProductDTO) {
        String sql = "INSERT INTO beauty_prodt(name, brand, price, category, description) VALUES(?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(
                DBConst.Url.getProperty(),
                DBConst.Username.getProperty(),
                DBConst.Secret.getProperty());
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, beautyProductDTO.getName());
            ps.setString(2, beautyProductDTO.getBrand());
            ps.setDouble(3, beautyProductDTO.getPrice());
            ps.setString(4, beautyProductDTO.getCategory());
            ps.setString(5, beautyProductDTO.getDescription());

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    }

