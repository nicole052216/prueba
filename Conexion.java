/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

  
    public Conexion(String N, String P ) {
        String CONTROLADOR="com.mysql.jdbc.Driver";
        String URL_PASSWORD="jdbc:mysql://localhost/password";
        String usuario="root";
        String contrase="";
        Connection conexion=null; //maneja la conexion;
        Statement Instruccion= null; //Instruccion Consulta;
        
        try{
            Class.forName(CONTROLADOR);
            conexion=DriverManager.getConnection(URL_PASSWORD,"root","");
            if(conexion!=null){
                System.out.println("Conexion exitosa");
            }
            Instruccion=conexion.createStatement();
            Instruccion.execute("INSERT INTO persona VALUES(null,'"+N+"','"+P+"')");
           
            System.out.println("Inserción Exitosa");
        } 
        catch(ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
               Instruccion.close();
               conexion.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "POR FAVOR ENCIENDA LA BASE DE DATOS");
                e.printStackTrace();
            }
        }
    }
}
