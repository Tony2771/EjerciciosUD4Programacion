package aceptaelretoUD4vectores;

import java.util.Scanner;

public class P_124 {
    
    static void rellenar(int v[],String n){
        int j=v.length-1;
        for (int i = n.length()-1; i >=0; i--) {
            v[j--]=n.charAt(i)-'0';
        }
    }
    
    static int acarreo(int[] v2, int[] v1){
        final int acarreo=1;
        int contador=0;
        
        for (int i = v1.length-1; i >= 0; i--) {
            if(v1[i]+v2[i]>9){
                contador++;
                v1[i--]+=acarreo;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n1=in.next();
        String n2=in.next();
        int v1[];
        int v2[];
        int max;
        
        while((!n1.equals("0"))||(!n2.equals("0"))){
            max=Math.max(n1.length(), n2.length());
            
            v1=new int [max];
            v2=new int [max];
            
            rellenar(v1,n1);
            rellenar(v2,n2);
            
            System.out.println(acarreo(v2, v1));
            
            n1=in.next();
            n2=in.next();
        }
    }
}