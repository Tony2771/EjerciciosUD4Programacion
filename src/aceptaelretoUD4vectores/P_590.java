package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_590 {

    static boolean esTriangular(int matriz[][]){
        boolean superior = true;
        boolean inferior = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i!=j)
                    if(j>i)
                        superior = superior && matriz[i][j]==0;
                    else if(j<i)
                        inferior = inferior && matriz[i][j]==0;
            }
        }
        
        return superior||inferior;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lado;
        
        while((lado=in.nextInt())!=0){
            int [][] matriz = new int [lado][lado];
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j]=in.nextInt();
                }
            }
            
            System.out.println(esTriangular(matriz)? "SI" : "NO");
        }
    }
}