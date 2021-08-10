/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;*/
 
public class datadb{
    public static void main(String[] args) {

        System.out.println("hello");
        // creates three different Connection objects
       /* Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
        PreparedStatement ps=null;
 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/tempadmin";
            String user = "petclinic";
            String password = "petclinic";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
              ps=conn1.prepareStatement("insert into admin values (?,?)");
				 ps.setString(1,"preeta");
				 ps.setString(2,"root123");
				 ps.executeUpdate();
         System.out.println("Created table in given database..."); 
         
         // STEP 4: Clean-up environment 
         
                
            }
            
  } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }*/
    }
}
