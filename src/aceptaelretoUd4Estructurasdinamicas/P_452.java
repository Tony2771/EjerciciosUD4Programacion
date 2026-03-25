package aceptaelretoUd4Estructurasdinamicas;

import java.util.*;

public class P_452 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numNumeros;
        int[] bingo;
        TreeSet<Integer>resultado;
        StringBuilder sb;
        
        while((numNumeros=in.nextInt())!=0){
            bingo = new int [numNumeros];
            resultado=new TreeSet<>();
            
            for (int i = 0; i < numNumeros; i++)
                bingo[i]=in.nextInt();
            
            Arrays.sort(bingo);
            
            for (int i = bingo.length-1; i > 0; i--) 
                for (int j = i-1; j >=0; j--) 
                    resultado.add(bingo[i]-bingo[j]);
            
            sb=new StringBuilder();
            Iterator it = resultado.iterator();
            for (int i = 0; i < resultado.size()-1; i++) 
                sb.append(it.next()).append(" ");
            sb.append(it.next());
            System.out.println(sb.toString());
        }
    }
}