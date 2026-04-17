package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_647 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=in.nextInt();
        int numCapitulos;
        int i,j; //Punteros izquierda y derech
        int max; //Num de capitulos vistos
        int contador; // Num de numeros que hay entre punteros
        int capitulos[];
        HashSet<Integer> vistos;
        
        while(casos-->0){
            numCapitulos=in.nextInt();
            vistos = new HashSet<>();
            capitulos = new int [numCapitulos];
            
            for (int k = 0; k < numCapitulos; k++) {
                capitulos[k]=in.nextInt();
            }
            
            i = max = 0;
            
            for (j = 0; j < numCapitulos; j++) {
                
                while(vistos.contains(capitulos[j])){
                    vistos.remove(capitulos[i]);
                    i++;
                }
                vistos.add(capitulos[j]);
                
                contador = j - i + 1; //Tambien se puede usar vistos.size() 
                                      // para saber los numeros que hay en el conjunto
                                      // en ese caso no nos haria falta la variable contador
                if(contador > max)
                    max = contador;
            }
            System.out.println(max);
        }
    }
}