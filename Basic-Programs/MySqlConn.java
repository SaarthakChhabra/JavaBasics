package javabasics;

/**Cl
 *
 * @author Saarthak
 */
import java.sql.*;
public class MySqlConn 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root", "India@123");
            //here is 'data1' database name and 'root' is username and password is written
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            con.close();
            
        }catch(ClassNotFoundException | SQLException e){System.out.println(e);}
        
    }
    
}
