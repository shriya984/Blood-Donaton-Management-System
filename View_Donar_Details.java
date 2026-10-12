/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donar;

import dbdriver.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class View_Donar_Details 
{
    public void getViewDonarDetails()
    {
        String token_Status="Token Given";
        try
        {
            Statement st1=new DBConnection().getConnection();
            Statement st2=new DBConnection().getConnection();
            
            String query="select * from donar_info where token_status='"+token_Status+"'";
             
            ResultSet rs1=st1.executeQuery(query);
            ResultSet rs2=st2.executeQuery(query);
              
              int row=0;
              while(rs1.next())
              {
                  row++;
              }
              int i=0;
              String data[][]=new String[row][3];
              while(rs2.next())
              {
                  String addhar=rs2.getString(1);
                  data[i][0]=addhar;
                  String name=rs2.getString(2);
                  data[i][1]=name;
                  String token_status=rs2.getString(14);
                  data[i][2]=token_status;
                  i++;
              }
              View_Donar_Details_Frame.data1=data;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
    }
}
