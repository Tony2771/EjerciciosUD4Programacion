package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_666 {
    
    static boolean esCalambur(String frase,String comparativa){
        //i y j seran punteros que apunten a las posiciones 
        //de las letras de las cadenas que vamos a comparar
        int i;
        int j;
        
        i=siguiente(frase, -1);
        j=siguiente(comparativa, -1);
        
        while(i != -1 && j != -1){
            if((frase.charAt(i)|32)!=(comparativa.charAt(j)|32))
                return false;
            i=siguiente(frase, i);
            j=siguiente(comparativa, j);
        }
        //Si los punteros llegaron al final de las frases es que son Calambur
        //Si un puntero alcanzo el final solo en una frase indica que las frases no son Calambur
        return i==-1&&j==-1;
    }
    
    static int siguiente(String frase, int pos){
        pos++;
        
        while(pos<frase.length()&&!esValido(frase.charAt(pos))){
            pos++;
        }
        
        if(pos==frase.length())
            return -1;
        
        return pos;
    }
    
    static boolean esValido(char a){
        return!(a=='.'||a==';'||a==':'||a==','||a==' ');
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=in.nextInt();
        in.nextLine();
        String frase;
        String comparativa;
        
        while(casos-->0){
            frase=in.nextLine();
            comparativa=in.nextLine();
        
            if(esCalambur(frase,comparativa))
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}