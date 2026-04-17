package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_748 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map;
        
        int forajidos;
        int armas;
        int suma;
        String nombre;
        
        while((forajidos=in.nextInt())!=0){
            map = new HashMap<>();
            
            while(forajidos-->0){
                nombre=in.next();
                suma=0;
                
                if(nombre.equals("?")){
                    armas=in.nextInt();
                    
                    while(armas-->0){
                        nombre=in.next();
                        suma+=map.get(nombre);
                        map.remove(nombre);
                    }
                    System.out.println(suma);
                }else{
                    if(map.containsKey(nombre))
                        map.put(nombre, map.get(nombre) + in.nextInt());
                    else
                        map.put(nombre, in.nextInt());
                }
            }
            System.out.println("---");
        }
    }
}