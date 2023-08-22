
package DB;

import java.sql.*;
/**
 * @author Kashinath
 */
public class ConnectDB {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/beverageinventory ","root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(getCon());
    }
    
}
