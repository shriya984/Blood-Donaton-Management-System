/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class EditProfile 
{
   public boolean isUpdate(Statement st,String name,String email,String mobile,String address,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="update registration_info set name='"+name+"',email_id='"+email+"',mobile_number='"+mobile+"',address='"+address+"',password='"+password+"'where username='"+username+"'";
            int x=st.executeUpdate(query);
            if((x>0))
                flag=true;
            else
                flag=false;
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception is"+ex);
        }
       return flag;
    }  
}
