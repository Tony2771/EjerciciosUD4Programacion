package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;
import java.util.Scanner;

public class P_185 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPotitos;
        HashSet<String> gusta;
        TreeSet<String> noGusta;
        
        String ingrediente;
        
        while((numPotitos=in.nextInt())!=0){
            gusta= new HashSet<String>();
            noGusta = new TreeSet<String>();
            
            while(numPotitos-->0) {
                if(in.next().equals("SI:")){
                   while(!(ingrediente=in.next()).equals("FIN")){
                       gusta.add(ingrediente);
                   }
                }
                else
                   while(!(ingrediente=in.next()).equals("FIN")){
                       noGusta.add(ingrediente);
                   }
            }
            
                noGusta.removeAll(gusta);

                if(noGusta.isEmpty())
                    System.out.println("");
                else{
                    Iterator it = noGusta.iterator();
                    for (int j = 0; j < noGusta.size()-1; j++)
                        System.out.printf(it.next() + " ");
                    System.out.println(it.next());
                }
        }
    }
}