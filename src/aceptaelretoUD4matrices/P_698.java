package aceptaelretoUD4Matrices;

import java.util.Scanner;

public class P_698 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lado;
        long suma;
        int mayor;
        int casos=in.nextInt();
        int dato;
        
        while(casos-->0){
            lado=in.nextInt();
            
            suma=mayor=0;
            for (int i = 0; i < lado*lado; i++) {
                dato=in.nextInt();
                suma+=dato;
                if(dato>mayor)
                    mayor=dato;
            }
            if(suma==mayor*2)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}