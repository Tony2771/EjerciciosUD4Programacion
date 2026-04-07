package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_214 {
    
    public static void nuevo(HashMap<String,Integer> mapa,String nombre){
        if(mapa.containsKey(nombre))
            mapa.put(nombre, mapa.get(nombre)+1);
        else
            mapa.put(nombre,1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int posicion;
        String nombre;
        HashMap<String,Integer> mapa;
        
        while((numero=in.nextInt())!=0){
            mapa = new HashMap<>();
            posicion=0;
            
            while(numero-->0){
                nombre=in.next();
                nuevo(mapa,nombre);
            }
            
            numero=in.nextInt();
            while(numero-->0){
                nombre=in.next();
                nuevo(mapa,nombre);
                System.out.println(mapa.get(nombre));
            }
            System.out.println();
        }
    }
}