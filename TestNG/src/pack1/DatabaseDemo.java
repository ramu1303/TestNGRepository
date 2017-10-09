package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.testng.annotations.Test;

public class DatabaseDemo 
{
@Test
public void mySQL() throws Exception
{
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students?autoReconnect=true&useSSL=false", "root", "sql123$");
    Statement stmt= con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from studentinfo");
    while(rs.next())
    {
    	System.out.print(rs.getString("name"));
    	System.out.print("  "+rs.getString("id"));
    	System.out.println();
    	
    }
    con.close();
}
}
