/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicole Clavijo
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PASSWORD NICOLE
        //comentario
        String N;
        String P="";
        int longitud;
        longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud"));
        Contraseña pass=new Contraseña(longitud);
        N=JOptionPane.showInputDialog("iNGRESE EL NOMBRE");
        
        while(pass.esFuerte()!=true){
            pass.generarPassword();
             pass.contraseñaGenerada();
             pass.esFuerte();
         if(pass.esFuerte()==true){
            P=pass.contraseñaGenerada();
        }
        }

        
        Conexion conecction=new Conexion(N,P);
        
        GUI gui=new GUI(P);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

   
    
}
