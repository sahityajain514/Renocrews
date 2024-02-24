import java.sql.*;
public class InsertTable {
    public static void main(String[] args) {
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabasetoday","root","Pass");
    //create query
    String query="insert into table1(tName,tCity) values(?,?)";
    //PreparedStatement object
    PreparedStatement ps=con.prepareStatement(query);
    //set the values to the query
    ps.setString(1,"Sahitya jain");
    ps.setString(2,"Damoh");
    ps.executeUpdate();
    System.out.println("inserted");
    ps.close();
    con.close();
}
catch(Exception e){
    e.printStackTrace();
}
    }
}
