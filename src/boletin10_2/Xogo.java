
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Xogo {
 
    public void numeroAleatorio(){
    int numeroramdom=(int)(Math.random()*6);
    boolean respuesta=false;
    while(respuesta!=true){
    int res=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
    if (res<numeroramdom){
    JOptionPane.showMessageDialog(null, "El numero introducido es menor");
    }
    if (res>numeroramdom){
    JOptionPane.showMessageDialog(null, "El numero introducido es mayor");
    }
    if (res==numeroramdom){
    respuesta=true;
    JOptionPane.showMessageDialog(null, "has acertado");
   
    }
}
    
    }
}
