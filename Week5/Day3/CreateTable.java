
import java.sql.*;
class CreateTable {
    public static void main(String[] args) {

        try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabasetoday","root","Papa@199901SJ");
//create query
            String query="create table table1(tId int(20) primary key auto_increment ,tName varchar(200) not null , tCity varchar(300))";

            //create statement
            Statement st=con.createStatement();
            st.executeUpdate(query);
            System.out.println("Table created");
            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
}
}
