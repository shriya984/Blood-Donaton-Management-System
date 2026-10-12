/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donar;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class CheckAddharNumber
{
     public boolean checkAddharNo(Statement st,String addharno)
    {
        boolean flag=false;
        try
        {
            String query="select * from donar_info where addhar_no='"+addharno+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
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

   
    

    
  

