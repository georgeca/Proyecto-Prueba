/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alum.fial7
 */
public class Conexion {
    public static String url = "";
    public static String usuario = "";
    public static String clave= "";
    private static Connection conex=null;
    
    public static Connection getConexion(){
        try {
             if(conex==null){
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection(url,usuario,clave);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        
        return conex;
    }
}
