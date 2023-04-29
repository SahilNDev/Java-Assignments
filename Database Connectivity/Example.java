import java.sql.*;
import java.util.*;
class Example{
public static void main(String args[])throws Exception{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver loaded");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
System.out.println("Connection Established");

Statement st = con.createStatement();
st.executeUpdate("insert into designation values(3, 'how is life')");
ResultSet rs = st.executeQuery("select * from designation");

System.out.println("Code Title");
System.out.println("------------------------------------------");
while(rs.next()){
System.out.println(rs.getInt(1)+ " " +rs.getString(2));
}
}
}