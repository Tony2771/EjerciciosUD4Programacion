package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_169 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos,contador,hermanos;
        String linea;
        HashMap<String,Integer> map;
        
        casos=in.nextInt();
        in.nextLine();
        while(casos-->0){
            map = new HashMap<>();
            contador=hermanos=0;
            
            while(!(linea=in.nextLine()).equals("====")){
                contador++;
                
                linea=linea.substring(0, linea.indexOf(",")).toLowerCase();
                
                if(map.containsKey(linea))
                    map.put(linea, map.get(linea) + 1);
                else
                    map.put(linea, 1);
                
            }
            
            for(Map.Entry<String,Integer> entry: map.entrySet())
                if(entry.getValue()>1)
                    hermanos += entry.getValue();
            
            System.out.println(contador + " " + hermanos);
        }
    }
}