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
public class UserDataFetcher 
{
    public ArrayList getData(Statement st,String username)
    {
        ArrayList data=new ArrayList();
        try
        {
            String query="select * from registration_info where username='"+username+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                String name=rs.getString(1);
                String email=rs.getString(2);
                String mobile=rs.getString(3);
                String address=rs.getString(4);
                String password=rs.getString(6); 
                
                data.add(name);
                data.add(email);
                data.add(mobile);
                data.add(address);
                data.add(username);
                data.add(password);
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception is:"+ex);
        }
        return data;
    }
}
