package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_337 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX=6;
        int casos=in.nextInt();
        int[] arriba =new int[MAX];
        int altura;
        boolean encajan;
        
        while (casos-->0){
            for (int i = 0; i < MAX; i++) {
                arriba[i]=in.nextInt();
            }
            
            encajan=true;
            altura=in.nextInt()+arriba[0];
            
            for (int i = 1; i < MAX; i++) {
                if(in.nextInt() + arriba[i]!=altura){
                    encajan=false;
                    in.nextLine();
                    break;
                }
            }
            
            if(encajan)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}