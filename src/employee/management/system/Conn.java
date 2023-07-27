package employee.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");//step 1: register the driver class
            //step2. establish connection
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","Priti@10");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
