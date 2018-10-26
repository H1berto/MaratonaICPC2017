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
public class FrequenciaMaior {
    public static void main(String args[]) {

        int nVezes = 1, v, i = 0;
        int moda = 0;
        int comparaV = 0;
        int M[] = {1, 1, 1, 3, 3, 3,4,4,4};
        
        
        for (int p = 0; p < M.length; p++) {
            nVezes = 1;

            for (int k = p + 1; k < M.length; k++) {
                if (M[p] == M[k]) {
                    ++nVezes;
                }
            }
            if (nVezes > comparaV) {
                moda = M[p];            
                comparaV = nVezes;
            }else if(nVezes == comparaV){
                if(M[p]>moda){
                    moda=M[p];
                }
            }
        }
        
         System.out.println("moda: "+moda);
    }
}
