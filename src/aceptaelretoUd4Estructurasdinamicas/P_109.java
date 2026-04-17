package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_109 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map;
        
        String local,visitante;
        int setLocal,setVisitante,partidos;
        while(!(in.next()).equals("FIN")){
            map=new HashMap<>();
            partidos=0;
            while(!(local=in.next()).equals("FIN")){
                partidos++;
                setLocal=in.nextInt();
                visitante=in.next();
                setVisitante=in.nextInt();
                
                if(!map.containsKey(local))
                    map.put(local, 0);
                
                if(!map.containsKey(visitante))
                    map.put(visitante, 0);
                
                if(setLocal>setVisitante){
                    map.put(local, map.get(local) + 2);
                    map.put(visitante, map.get(visitante) + 1);
                }else{
                    map.put(visitante, map.get(visitante) + 2);
                    map.put(local, map.get(local) + 1);
                }
            }
            int max = 0;
            int puntuacion;
            String ganador = "";
            
            for(String equipo:map.keySet()){
                puntuacion = map.get(equipo);
                if(puntuacion>max){
                    max=puntuacion;
                    ganador=equipo;
                }else if(puntuacion == max)
                    ganador = "EMPATE";
            }
            
            System.out.println(ganador + " " + (map.size() * (map.size() - 1) - partidos));
        }
    }
}