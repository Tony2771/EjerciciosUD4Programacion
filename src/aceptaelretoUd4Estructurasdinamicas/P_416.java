package aceptaelretoUd4Estructurasdinamicas;

import java.util.HashSet;
import java.util.Scanner;

public class P_416 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numFechas;
        int tamaño=0;
        String cumple;
        HashSet<String> fechas;
        
        while((numFechas=in.nextInt())!=0){
            tamaño=numFechas;
            fechas = new HashSet<>();
            while(numFechas-->0){
                cumple=in.next();
                fechas.add(cumple.substring(0, cumple.length()-5));
            }
            System.out.println((fechas.size()==tamaño)?"NO":"SI");
            tamaño=0;
        }
    }
}