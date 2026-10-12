/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Check_Username 
{
    public ArrayList checkUsername(Statement st)
    {
        ArrayList a1=new ArrayList();
        try
        {
            String query="select * from registration_info";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                String username=rs.getString(5);
                a1.add(username);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is:"+ex);
        }
        System.out.println("A1 is:"+a1);
        return a1;
    }
}
