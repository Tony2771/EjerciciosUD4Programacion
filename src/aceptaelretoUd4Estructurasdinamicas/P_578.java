package aceptaelretoUd4Estructurasdinamicas;

import java.util.HashSet;
import java.util.Scanner;

public class P_578 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos;
        
        while((casos=in.nextInt())!=0){
            in.nextLine();
            HashSet<String> conjunto = new HashSet();
            while(casos-->0){
                conjunto.add(in.nextLine().toLowerCase());
            }
            System.out.println(conjunto.size());
        }
    }
}