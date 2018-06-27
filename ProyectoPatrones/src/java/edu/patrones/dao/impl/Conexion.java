package edu.patrones.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    private static Connection instance;

    private Conexion() {
        InputStream inputStream = Conexion.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        System.out.println("creando una nueva conexion");
        try {
            properties.load(inputStream);
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            Class.forName(driver);
            instance =  DriverManager.getConnection(url, user, password);
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (instance == null) {
            new Conexion();
        }
        return instance;
    }

}
