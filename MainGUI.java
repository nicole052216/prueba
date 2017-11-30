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
public class MainGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String N;
        String P="";
        int longitud=15;
        Contraseña contra=new Contraseña(longitud);
        
        while(contra.esFuerte()!=true){
            contra.generarPassword();
             contra.contraseñaGenerada();
             contra.esFuerte();
         if(contra.esFuerte()==true){
            P=contra.contraseñaGenerada();
        }
        }
        
        GUI gui=new GUI(P);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
    
}
