package com.cognizant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CreateTableMySQL {
    public static void main(String[] args) throws Exception {
        //Initialize an appropriate JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //connect to MySQL db_cognizant Database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test","root","");
        System.out.println("<<< Connected to Database");
        
        //create a provision for passing SQL query
        Statement st = con.createStatement();
        
        String sql = "create table emp(empno int(5), ename varchar(25), sal float(10,2), primary key(empno))";
        
        try {
            //pass SQL query to connected DB
            st.execute(sql);
            System.out.println("<<< Database Table \"emp\" created!");
        }catch(Exception ex) {
            System.out.println("Exception: "+ ex.toString());
        }
        
        //close the connection with database
        st.close();
        con.close();         
    }
}