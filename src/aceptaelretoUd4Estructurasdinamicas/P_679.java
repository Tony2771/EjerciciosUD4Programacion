package aceptaelretoUd4Estructurasdinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class P_679 {
    static Scanner in = new Scanner(System.in);
        
    static void resuelveCaso(){
        String palabra;
        // Índice de la última palabra válida dentro del
        // ArrayList
        int fin = 0;
        ArrayList<String> frase = new ArrayList();
        
        while (!(palabra = in.next()).equals("."))
            if (palabra.equals("<")){
                if (fin > 0)
                    fin--;
            } else if (palabra.equals(">")){
                if (fin < frase.size())
                    fin++;
                else if (fin > 0){
                    frase.add(frase.get(fin - 1));
                    fin++;
                }
            } else
                frase.add(fin++, palabra);
        
        for (int i = 0; i < fin - 1; i++) 
            System.out.print(frase.get(i) + " ");
        System.out.println(frase.get(fin - 1));
    }
    
    public static void main(String[] args) {
        int casos = in.nextInt();
        
        while (casos-- > 0)
            resuelveCaso();
    }
}