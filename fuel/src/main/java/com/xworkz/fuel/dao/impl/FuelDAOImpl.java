package com.xworkz.fuel.dao.impl;

import com.xworkz.fuel.FuelDTO;
import com.xworkz.fuel.dao.FuelDAO;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class FuelDAOImpl implements FuelDAO {
     String sql="Insert into fuel_station(name,location,barcode,fuel_type) values (?,?,?,?)";
    @Override
    public boolean save(FuelDTO fuelDTO) {

            try (Connection connection = DriverManager.getConnection(DBConst.Url.getProperty(),
                    DBConst.Username.getProperty(), DBConst.Secret.getProperty())) {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, fuelDTO.getName());
                ps.setString(2, fuelDTO.getLocation());
                ps.setString(3, fuelDTO.getBarcode());
                ps.setString(4, fuelDTO.getFuelType());

                int row = ps.executeUpdate();
                System.out.println("The number of row updated " + row);
                return row > 0;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

