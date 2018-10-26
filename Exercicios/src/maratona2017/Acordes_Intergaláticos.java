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
public class Acordes_Intergaláticos {
    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
    int nVezes; 
    int comparaV = 0;
    int f = 0;
    int N = entrada.nextInt();
    int Q = entrada.nextInt();
    Integer [] notas = new Integer[N];
    Integer [][] acordes = new Integer[Q][2];
        //Notas iniciais
        for (int i = 0; i < N; i++) {
            notas[i]=1;
            
        }
        
        
        
        //Acordes Q= numero de linhas e sempre 2 como coluna,2  = (A,B)
        for (int i = 0; i < Q; i++) {
            //System.out.print("\n");
            for (int j = 0; j < 2; j++) {
                acordes[i][j]= entrada.nextInt();
                
            }
        }
        
       
        
            
     
        //Frequencia em cada acorde 
        for (int i = 0; i < Q; i++) {
            
               comparaV=0;
               nVezes = 1;
            for (int p = acordes[i][0]; p < acordes[i][1]; p++) {
                
                
                for (int k = p + 1; k <= acordes[i][1]; k++) {
                    if (notas[p] == notas[k]) {
                        ++nVezes;
                    }
                }
                
                 if (nVezes > comparaV) {
                    f = notas[p];   
                    comparaV = nVezes;    
                }else if(nVezes == comparaV){
                    if(notas[p]>f){
                        f=notas[p];
                    }
                }
            }
//         System.out.println(f);   
            for (int j = acordes[i][0]; j <= acordes[i][1]; j++) {
                notas[j]+=f;
//          System.out.print(notas[j]+" ");;
            }
                 
          
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+" ");
        }
        
    }
}
     

