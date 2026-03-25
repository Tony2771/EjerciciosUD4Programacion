package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_429 {
    
    static boolean getPlazas(int[]plazas,int[]aviones){
        int max=0;
        int posicion=0;
        
        for (int i = 0; i < aviones.length; i++) {
            for (int j = 0; j < plazas.length; j++) {
                if(plazas[j]>max){
                    max=plazas[j];
                    posicion=j;
                }
            }
            max-=aviones[i];
            plazas[posicion]-=aviones[i];
            if(max<0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hangares;
        int numAviones;
        
        while((hangares=in.nextInt())!=0){
            int plazas[]=new int[hangares];
            for (int i = 0; i < hangares; i++) {
                plazas[i]=in.nextInt();
            }
            
            numAviones=in.nextInt();
            int aviones[]=new int [numAviones];
            for (int i = 0; i < numAviones; i++) {
                aviones[i]=in.nextInt();
            }
            
            System.out.println(getPlazas(plazas,aviones)?"SI":"NO");
            
        }
    }
}