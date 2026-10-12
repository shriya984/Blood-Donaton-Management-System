
package dbdriver;

import java.sql.Statement;

public class Registration
{
    public boolean isInsert(Statement st,String name,String email,String mobile,String address,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="insert into registration_info values('"+name+"','"+email+"','"+mobile+"','"+address+"','"+username+"','"+password+"')";
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
