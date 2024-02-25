package com.jdbc;
import java.sql.*;
import java.io.*;

public class UpdateTable {
    public static void main(String[] args) {
        try{
          //get connection
Connection con=ConnectionProvider.getConnection();
          //write query
String query="update table1 set tName=? ,tCity=? where tId=?";
          //taking input
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name:  ");
           String name= br.readLine();
            System.out.println("Enter city name: ");
            String city=br.readLine();
            System.out.println("Enter tId for update");
            int id=Integer.parseInt(br.readLine());
            PreparedStatement ps=con.prepareStatement(query);
          //updating
            ps.setString(1,name);
            ps.setString(2,city);
            ps.setInt(3,id);
     ps.executeUpdate();

     con.close();

            System.out.println("done");

        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
