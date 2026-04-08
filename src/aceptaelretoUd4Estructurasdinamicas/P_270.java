package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_270 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos,nota;
        String nombre;
        TreeMap<String,Integer> map;
        
        while((casos=in.nextInt())!=0){
            in.nextLine();
            map = new TreeMap<>();
            while(casos-->0){
                nombre=in.nextLine();
                nota=in.nextLine().equals("CORRECTO")? 1 : -1;
                
                if(map.containsKey(nombre))
                    map.put(nombre, map.get(nombre) + nota);
                else
                    map.put(nombre, nota);
            }
            
            for (String alumno:map.keySet()){
                nota = map.get(alumno);
                if(nota!=0)
                    System.out.println(alumno + ", " + nota);
            }
            System.out.println("---");
        }
    }
}