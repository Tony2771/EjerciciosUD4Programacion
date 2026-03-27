package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_139 {
    
    static void cubifinito(int n){
        HashSet <Integer> numeros = new HashSet<>();
        
        while(true){
            System.out.print(n);
            
            if(n==1){
                System.out.println(" -> cubifinito.");
                return;
            }
            if(numeros.contains(n)){
                System.out.println(" -> no cubifinito.");
                return;
            }
            System.out.print(" - ");
            numeros.add(n);
            n = getCubo(n);
        }
    }
    
    static int getCubo(int n){
        int unidades;
        int suma=0;
        while(n>0){
            unidades=n%10;
            unidades=unidades*unidades*unidades;
            suma+=unidades;
            n/=10;
        }
        return suma;
    }
            
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        
        while((numero=in.nextInt())!=0){
            cubifinito(numero);
        }
    }
}