package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_709 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos;
        HashMap<String,Integer> map;
        String sede;
        String ganador;
        int max;
        
        while((casos=in.nextInt())!=0){
            map =new HashMap<>();
            //Lectura de votos
            while(casos-->0){
                sede=in.next();
                if(map.containsKey(sede))
                    map.put(sede, map.get(sede)+1);
                else
                    map.put(sede,1);
            }
            //Eleccion del ganador
            ganador="";
            max=0;
            for(String key:map.keySet()){
                if(map.get(key)>max){
                    ganador=key;
                    max = map.get(key);
                } else if(map.get(key)==max)
                    ganador="EMPATE";
            }
            System.out.println(ganador);
        }
    }
}