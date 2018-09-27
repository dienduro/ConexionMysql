package conexionmysqlcorva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




 
public class conexion {
    Connection co;
    Statement stm;
    public conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection co = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mysqlcorva?user=root&password=");
        Statement stm = co.createStatement();
        ResultSet rs = stm.executeQuery("select * from terceros");
        
        while (rs.next()){
            System.out.println(rs.getString( "id"));
            System.out.println(rs.getString(2));
                }
        }catch (ClassNotFoundException exc){
             exc.printStackTrace();
        
        }catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
