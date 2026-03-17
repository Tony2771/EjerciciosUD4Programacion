package EstructurasdatosUD4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio43 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       ArrayList<String> lista = new ArrayList<>();
       String nombre=in.next();
       
       while(!nombre.equalsIgnoreCase("fin")){
           lista.add(nombre);
           nombre=in.next();
       }
        //a) Bucle basico
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        //b) Bucle modificado
        for(String fruta:lista){
            System.out.println(fruta);
        }
        
        //c) Instruccion forEach
        lista.forEach(System.out::println);
        
        //d) Con la flecha y las llaves puede hacer varias cosas.
        lista.forEach(fruta -> {
            System.out.println(fruta);
            System.out.println(fruta.toUpperCase());});
        
        //e) Usando el Iterator //Es la forma mas dificil.
        Iterator<String> it =lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
            
    }

}