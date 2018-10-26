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
class MMC {
    //Algoritmo de Euclides iterativo
    public int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    //Algoritmo do MMC
    public int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }
    

}
public class Cigarras_Periodicas {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   
        MMC multiplo = new MMC();
        int N = entrada.nextInt();
        int L = entrada.nextInt();
        int mmc1 =0;
        int mmc2 =0;
        int cont= 1;
        int pextra = 0;
        int maior =0;
        Integer [] Ci = new Integer[N];
      
        for (int i = 0; i < N; i++) {
            Ci[i]=entrada.nextInt();
        }
        
            
        //Fatoração em numeros primos
        if(N==2){
            mmc1=multiplo.mmc(Ci[0],Ci[1]);
        }else{
            mmc1=multiplo.mmc(Ci[0],Ci[1]);         
            for (int i = 2; i < N; i++) {
                mmc1=multiplo.mmc(mmc1,Ci[i]);
            }
        }    
        
        if(mmc1==L){
            pextra=1;
        }else{
            while(mmc2<L){
                mmc2=multiplo.mmc(mmc1,cont);
                if(mmc2>maior&&mmc2<L){
                    maior=mmc2;
                    pextra=cont;
                }
                cont++;
            }
        }
        
        for (int i = 72; i < 100; i++) {
            System.out.println(multiplo.mmc(42, i));
        }
        
        
    }

        
        
    }


