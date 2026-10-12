/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donar;

import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class Edit_Donor_Details
{
    public boolean isDonarDetailsUpdated(Statement st,String addhar,String token_status)
    {
        boolean flag=false;
        try
        {
            String query="update donar_info set token_status='"+token_status+"' where addhar_no='"+addhar+"'";
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is:"+ex);
        }
        return flag;
    }
}
