import java.io.*;
import java.sql.*;
public class InsertTable {
    public static void main(String[] args) {
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabasetoday","root","Papa@199901SJ");
    //create query
    String query="insert into table1(tName,tCity) values(?,?)";
    //PreparedStatement object
    PreparedStatement ps=con.prepareStatement(query);
    //set the values to the query
//    ps.setString(1,"Sanyam jain");
//    ps.setString(2,"Dabra");
//    ps.executeUpdate();

    //dynamic changes
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Name");
    String name=br.readLine();
    System.out.println("Enter City");
    String city=br.readLine();
    ps.setString(1,name);
    ps.setString(2,city);
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
