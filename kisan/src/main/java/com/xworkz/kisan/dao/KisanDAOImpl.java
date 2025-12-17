package com.xworkz.kisan.dao;

import com.xworkz.kisan.DBConst;
import com.xworkz.kisan.dto.KisanDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class KisanDAOImpl implements KisanDAO {
    final String sql = "Insert into kisan1(name,phone,place,user_type) values (?,?,?,?)";

    @Override
    @SneakyThrows
    public boolean save(KisanDTO kisanDTO) {

        try (Connection connection = DriverManager.getConnection(DBConst.Url.getProperty(),
                DBConst.Username.getProperty(), DBConst.Secret.getProperty())) {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, kisanDTO.getName());
            ps.setString(2, kisanDTO.getPhone());
            ps.setString(3, kisanDTO.getPlace());
            ps.setString(4, kisanDTO.getUserType());

            int row = ps.executeUpdate();
            System.out.println("The number of row updated " + row);
            return row > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}



