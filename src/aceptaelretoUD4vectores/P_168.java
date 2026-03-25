package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_168 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos;
        int n;
        
        while((casos=in.nextInt())!=0){
            int piezas[]=new int[casos+1];
            for (int i = 0; i < casos-1; i++){
                n = in.nextInt();
                piezas[n]=n;
            }
            
            for (int i = 0; i < piezas.length; i++) {
                if(piezas[i]!=i){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}