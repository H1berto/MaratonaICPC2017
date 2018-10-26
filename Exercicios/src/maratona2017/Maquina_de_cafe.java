/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona2017;

import java.util.Scanner;

/**
 *
 * @author humbe
 */
public class Maquina_de_cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int m1,m2,m3;
        int a1 =0, a2=0,a3=0;
        
        a1 = entrada.nextInt();
         a2 = entrada.nextInt();
          a3 = entrada.nextInt();
          
          m1= (a2*2)+(a3*4);
           m2= (a1*2)+(a3*2);
            m3= (a1*4)+(a2*2);
       
         if(m1<=m2 && m1<=m3){
              System.out.println(m1);
         }else if(m2<=m1 && m2<=m3){
              System.out.println(m2);
         }else{
              System.out.println(m3);
         }
        
    }
    
}
