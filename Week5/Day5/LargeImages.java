package com.jdbc;
import java.sql.*;
import javax.swing.*;
import java.io.*;

public class LargeImages {
    public static void main(String[] args) {
        try{
          //get connection
            Connection con=ConnectionProvider.getConnection();
          //write query
            String query="insert into images(pic) values(?)";
          //for dynamic changes
            PreparedStatement ps=con.prepareStatement(query);
//open a dialog box for selecting files
            JFileChooser jfc=new  JFileChooser();
            jfc.showOpenDialog(null);
          //choose file
           File file= jfc.getSelectedFile();
           FileInputStream fis=new FileInputStream(file);



            ps.setBinaryStream(1,fis,fis.available());
            ps.executeUpdate();
           // System.out.println("done...");
          //diaglog box for suceess message
            JOptionPane.showMessageDialog(null,"suceessfully done");


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
