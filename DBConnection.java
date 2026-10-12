
package dbdriver;

import  java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
   public Statement getConnection() 
   {
       Statement st=null;
        try
        {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_donation","root","root");
             st=con.createStatement();
        }
        catch(Exception ex)
        {
            System.out.println("Exception is"+ex);
        }
        return st;
   }


    }

