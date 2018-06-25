package edu.patrones.dao.impl;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    private static Conexion instance;

    private Conexion() {
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Conexion();
            System.out.println(" Connection  - - - - - - - -  New Conexion created");
        }
        InputStream inputStream = Conexion.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
