package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_171 {
    
    static int getNumeroAbadias(int [] alturas){
        int contador=1;
        int pos=alturas.length-1;
        int max=alturas[pos];
        
        pos--;
        for (int i = pos; i >=0; i--) {
            if(alturas[i]> max){
                contador++;
                max=alturas[i];
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int montañas=in.nextInt();
        int v[];
        
        while(montañas-->0){
            v=new int[montañas];
            
            for (int i = 0; i < montañas; i++) {
                v[i]=in.nextInt();
            }
            
            System.out.println(getNumeroAbadias(v));
        }
    }
}