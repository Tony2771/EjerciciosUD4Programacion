package aceptaelretoud4Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class P_161 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeros;
        
        while((numeros=in.nextInt())!=0){
            int cadenaNumeros[]=new int [numeros];
            for (int i = 0; i < cadenaNumeros.length; i++) {
                cadenaNumeros[i]=in.nextInt();
            }
            Arrays.sort(cadenaNumeros);
            if(numeros%2!=0)
                System.out.println(cadenaNumeros[numeros/2]*2);
            else{
                System.out.println(cadenaNumeros[numeros/2-1]+cadenaNumeros[numeros/2]);
            }
        }
    }
}