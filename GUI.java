/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.FlowLayout;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class GUI extends JFrame implements ActionListener {
    private Container ventana;
    private FlowLayout esquemaVentana;
    private JPanel ventanas;
    private JLabel titulo;
    private JButton consultar;
    private JTextField entrada;
    private JTextArea salida;
    private JScrollPane barras;
    private String password;
    private String nombre;
    GUI(String P){
        
        password=P;
        ventana = getContentPane();
        ventanas = new JPanel();
        ventanas.setBackground(new java.awt.Color(255,255,255));

        esquemaVentana = new FlowLayout();
        ventanas.setLayout(esquemaVentana);
        
        titulo=new JLabel();
        titulo.setFont(new Font("Verdana", 1, 10));
        titulo.setForeground(new java.awt.Color(35, 130, 130));
        titulo.setText("Ingrese Login");
        ventanas.add(titulo);
        entrada=new JTextField(10);
        ventanas.add(entrada);
        
        salida = new JTextArea(10,18);
        barras =new JScrollPane(salida);
        ventanas.add(barras);
        consultar = new JButton("Consultar");
        consultar.addActionListener(this);
        ventanas.add(consultar);
        
        ventana.add(ventanas);
        setTitle("LOGIN");
        
        //Point p=new Point(350,10);
        
        setResizable(true);
        setSize(300,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evento){

        if(evento.getSource()==consultar){
            if (entrada.getText().compareTo("")>0){
                System.out.println("Procesando");
                nombre=entrada.getText();
                System.out.println(entrada.getText());
           
                salida.setText("su pass es  "+password);
                Conexion conecction=new Conexion(nombre,password);
            } 
            if (entrada.getText().compareTo("")==0){
                  System.out.println("Por Favor Ingrese Un Nombre");
            }   
        
         
        }  
    }
}
        
    
    
    
