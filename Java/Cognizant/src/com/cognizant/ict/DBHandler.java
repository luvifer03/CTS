package com.cognizant.ict;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBHandler {
    /**
     * This method should connect to the database by reading the database details
	 * from the db.properties file
	 * and it should return the connection object
     *
     * @return Connection to the database
	 * @throws java.io.IOException if properties file can be read
	 * @throws java.lang.ClassNotFoundException if driver class is not found
	 * @throws java.sql.SQLException there is some issues with creating the connection
	 * @see Connection
	 */
    public Connection establishConnection() {
        try {
            FileInputStream fileInputStream = new FileInputStream("db.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);

            Class.forName(properties.getProperty("db.classname"));

            return DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
