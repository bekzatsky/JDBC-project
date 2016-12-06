package kz.logitex.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.util.List;

/**
 * Created by Bekzat on 05.12.2016.
 */
public class Main {



    public static void main(String[] args) throws SQLException {

        DBWorker dbWorker = new DBWorker();
        String query = "select * from users";
        Statement statement = dbWorker.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt(1));
            user.setUsername(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));

            System.out.println(user);

        }

    }
}
