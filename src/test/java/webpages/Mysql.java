package webpages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {

    public void addItemToDB(){
        try {
            String userName = "root";
            String userPassword = "";
            String connectionUrl = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.jdbc.Driver");
            try (

                    Connection conn = DriverManager.getConnection(connectionUrl, userName, userPassword)) {
                Statement statement = conn.createStatement();
                statement.executeUpdate("create table IF NOT EXISTS SHOP1 (ID int primary key auto_increment, ProductName VARCHAR(20), Price INT)");
                statement.executeUpdate("INSERT shop1 (ProductName, Price) VALUES ('intel', 1200)");


                System.out.println("Connection begin...");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }

    }
}

