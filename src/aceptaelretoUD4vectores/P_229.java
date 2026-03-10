package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_229 {
    
    static boolean sonIguales(int[] v,int i ){
        int sumaIzquierda,sumaDerecha;
        
        sumaIzquierda=v[i];
        sumaDerecha=v[v.length-1] - sumaIzquierda;
        
        return sumaIzquierda==sumaDerecha;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numMovimientos;
        int contador;
        int[] movimientos;
        int numPuntos;
        
        while((numMovimientos=in.nextInt())!=0){
            
            movimientos=new int[numMovimientos+1];
            
            for (int i = 1; i <= numMovimientos; i++)
                movimientos[i]=in.nextInt() + movimientos[i-1];
            
            numPuntos=numMovimientos+1;
            contador=0;
            
            for (int punto = 0; punto < numPuntos; punto++) {
                if(sonIguales(movimientos,punto))
                    contador++;
            }
            System.out.println(contador);
        }
    }
}