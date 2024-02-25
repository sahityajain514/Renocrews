package com.jdbc;
import java.sql.*;
import java.io.*;

public class SelectData {
    public static void main(String[] args) {
        try{
          //get connection
Connection con=ConnectionProvider.getConnection();
          //write query
String query="select * from table1 ";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
          //printing all data
while(rs.next())
{
    int id=rs.getInt(1);
    String name=rs.getString(2);
    String city=rs.getString(3);
    System.out.println(id+" "+name+" "+city);
}
            System.out.println("Done...");
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
