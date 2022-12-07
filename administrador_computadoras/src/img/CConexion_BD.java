package img;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fabian
 */
public class CConexion_BD {
 
    public static final String url="jdbc:mysql://localhost/laboratorio";
    public static final String user="root"; 
    public static final String password="12345";
    public static final String driver="com.mysql.jdbc.Driver";

    public static Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       Connection cx;

    public CConexion_BD() {
    }
       
       public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url, user, password);
               System.out.println("SE CONECTO A BD"); 
        } catch (Exception ex) {
            System.out.println("EROR:  "+ex);
            System.out.println("NO SE CONECTO A BD");
        }
        return cx;
       }
        public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
        }
       }
        
        public static void main (String[]args){
            
            CConexion_BD conexion=new CConexion_BD();
            conexion.conectar();   
        }
}