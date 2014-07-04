/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Ingreso = new Scanner(System.in);
        
        String S1="";
        String S2="";
        S1=(JOptionPane.showInputDialog("Ingrese Valor dentro de la Cadena 1"));
        S2=(JOptionPane.showInputDialog("Ingrese Valor dentro de la Cadena 2"));
        int longitud1=S1.length();
        int longitud2=S2.length();
        char[] frasecadena1 = S1.toCharArray();
        char[] frasecadena2 = S2.toCharArray();
        for (int i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frasecadena1[j]== frasecadena2[i]) 
                  {
                      frasecadena1[j]=' ';
                  }
              }
          }
         for (int i=0;i<frasecadena1.length;i++)
               if (frasecadena1[i]!=' ') {
                   JOptionPane.showMessageDialog(null, frasecadena1[i] + " ");
               }
        
    }
    
}
