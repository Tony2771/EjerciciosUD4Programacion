package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_435 {
    
    static boolean esSubnormal(String cadena){
        int posiciones[]=new int[10];
        
        for (int i = 0; i < cadena.length(); i++) {
            posiciones[cadena.charAt(i)-'0']++;
        }
        
        for (int i = 0; i < posiciones.length; i++) {
            if(posiciones[0]!=posiciones[i])
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena;
        
        while(in.hasNext()){
            cadena=in.nextLine();
            if(esSubnormal(cadena))
                System.out.println("subnormal");
            else
                System.out.println("no subnormal");
        }
    }
}