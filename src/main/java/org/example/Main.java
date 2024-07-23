package org.example;

import java.sql.*;


// 1. Connect your IDE with Database. . .
// JDBC boiler plate. . . . . .

public class Main {

    // create connections. . .
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String username = "root";
    private static final String password = "Asdf@123";


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //  step 2 load drivers. . .
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password); // step 3
            Statement statement = connection.createStatement(); // step 4

            // UPDATE IN A TABLE... . .

//            String query = String.format("UPDATE students SET marks = %f WHERE id = %d", 88.5, 2);
//
//            int rowAffected= statement.executeUpdate(query);
//            if(rowAffected > 0){
//                System.out.println("Data Updated successfully");
//            }
//            else{
//                System.out.println("Data Not Updated");
//            }

            // GET DATA FROM TABLE. . .
//            String query = "SELECT * FROM students";    // to get. ..
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//
//                System.out.println("ID is:" + id);
//                System.out.println("Name is:" + name);
//                System.out.println("Age is:" + age);
//                System.out.println("Marks is:" + marks);
//            }


            // INSERT INTO TABLE. . .
//            String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %o, %f)", "Patel", 21, 70.5);
//
//            int rowAffected= statement.executeUpdate(query);
//            if(rowAffected > 0){
//                System.out.println("Data inserted successfully");
//            }
//            else{
//                System.out.println("Data Not Inserted");
//            }




             // DELETE IN TABLE
            String query = "DELETE FROM students WHERE id = 2";

            int rowAffected= statement.executeUpdate(query);
            if(rowAffected > 0){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Data Not Deleted");
            }


        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
        }
