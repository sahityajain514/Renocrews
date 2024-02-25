import java.sql.*;
import java.io.*;
public class InsertImage {
    public static void main(String[] args) {
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabasetoday","root","Pass");
String query="insert into images(pic) values(?)";
PreparedStatement ps=con.prepareStatement(query);
FileInputStream fis=new FileInputStream("C:\\Users\\sahitya\\OneDrive\\Pictures\\IMG_20190421_110331_632.jpg");
ps.setBinaryStream(1,fis,fis.available());
ps.executeUpdate();
    System.out.println("Done....");

}
catch(Exception e){
    System.out.println("Error occured !!");
}
    }
}
