/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona2017;

/**
 *
 * @author humbe
 */
public class Frequencia {
    public static void main(String args[]) {
        
        int nVezes = 1, v, i = 0;
        int moda = 0;
        int comparaV = 0;
        int M[] = {1, 1, 1, 3, 3, 3,4,4,4};
        int qtdmodas=0;
        Integer Modas[]= new Integer[M.length];
        for (int p = 0; p < M.length; p++) {
            nVezes = 1;

            for (int k = p + 1; k < M.length; k++) {
                if (M[p] == M[k]) {
                    ++nVezes;
                }
            }
            if (nVezes > comparaV) {
                moda = M[p];
                Modas[qtdmodas]=moda;
                comparaV = nVezes;
            }else if(nVezes == comparaV){
                qtdmodas++;
                Modas[qtdmodas]=M[p];
            }
        }
        
        if(qtdmodas>0){
            System.out.print("As modas são");
            for (int j = 0; j <= qtdmodas; j++) {
                if(j==qtdmodas){
                    System.out.println(" e "+Modas[j]+".");
                }else{
                System.out.print(", "+Modas[j]);
                }
            }
            
        }
        System.out.print("moda: "+moda);
        
    }
}

