package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsuarioDao {

	 private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	    private static final String URL = "jdbc:mysql://localhost:3306/prueba2";
	    private static final String USUARIO = "root";
	    private static final String CLAVE = "yesica213";
	    
	    private Connection conexion;
	    
	    public UsuarioDao() {
	    	conexion = null;
	    }

	    public void conectar() {
	        
	        
	        try {
	            Class.forName(CONTROLADOR);
	            conexion =  DriverManager.getConnection(URL, USUARIO, CLAVE);
	            System.out.println("Exito");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Error al cargar el controlador");
	            e.printStackTrace();

	        } catch (SQLException e) {
	            System.out.println("Error en la conexión");
	            e.printStackTrace();
	        }
	        
	     
	       
	    }
}
