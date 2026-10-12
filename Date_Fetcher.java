
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
public class Date_Fetcher 
{
    public ArrayList getLastDate(Statement st,String addharno)
    {
        ArrayList a1=new ArrayList();
        try
        {
            String query="select * from donar_info where addhar_no='"+addharno+"'";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                String date_time=rs.getString(15);
                String str[]=date_time.split(" , ");
                String date=str[0];
                a1.add(date);
            }
            System.out.println("Date is:"+a1);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is :"+ex);
        }
        return a1;
    }
}
