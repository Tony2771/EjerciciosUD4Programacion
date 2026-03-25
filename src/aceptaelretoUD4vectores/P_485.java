package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_485 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos;
        int recorrido;
        
        
        while((casos=in.nextInt())!=0){
            int km[]=new int [casos];
            recorrido=0;
            for (int i = 0; i < casos; i++) {
                km[i]=in.nextInt();
                recorrido+=km[i];
            }
            System.out.print(recorrido);
            
            for (int i = 0; i < km.length-1; i++) {
                recorrido-=km[i];
                System.out.print(" " + recorrido);
            }
            System.out.println("");
        }
    }
}