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
public class Add_donar_Details
{
    public boolean isInsert(Statement st,String addhar,String name,String mobile,String email,String address,String dob,String age,String gender,String height,String weight,String blood_grp,String bmi,String token_no,String token_status,String date_time,String blood_vol)
    {
        boolean flag=false;
        try
        {
            String query="insert into donar_info values('"+addhar+"','"+name+"','"+mobile+"','"+email+"','"+address+"','"+dob+"','"+age+"','"+gender+"','"+height+"','"+weight+"','"+blood_grp+"','"+bmi+"','"+token_no+"','"+token_status+"','"+date_time+"','"+blood_vol+"')";
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
