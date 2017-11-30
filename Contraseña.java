/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

/**
 *
 * @author Nicole Clavijo
 */
public class Contraseña {
    public static int longitud=8;
   public String contraseña="";
   int contmini=0;
   int contmayus=0;
   int contnum=0;
   String letras="0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
   
   char pass[]=letras.toCharArray();
   
    public Contraseña(int longitud) {
        this.longitud = longitud;
    }

    public void setLongitud(int longitud) {
        longitud = longitud;
    }
    
    
    public void generarPassword(){
        int num=0;
        while(num<longitud){
            int random=(int)(Math.random()*(pass.length));
            contraseña+=pass[random];
            num++;
        }
    }
    
    public String  getLongitud() {
       String r = "La Longitud es: ";
        return r+longitud;
    }
    
    public String contraseñaGenerada(){
        String pass;
        pass=contraseña;
       return pass;
    }
    
    
    
    public boolean esFuerte(){
        boolean r=false;
        char[] contra=contraseña.toCharArray();
        for (int i=0;i<contra.length;i++){
            if (Character.isUpperCase(contra[i])){
                contmayus++;
            }
            if (Character.isLowerCase(contra[i])){
                contmini++;
            }
            if (Character.isDigit(contra[i])){
                contnum++;
            }
        }
       
        if (contmayus>2 && contmini>1 && contnum>5){
            r=true;
        }else{
            r=false;
        }
       return r;
        
    }
    
   
}
