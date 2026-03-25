package aceptaelretoud4Vectores;

import java.util.Scanner;

public class P_179 {

    public static void main(String[] args) {
        final int MAX=1_000_001;
        Scanner in = new Scanner(System.in);
        
        int casos;
        int[]energia= new int [MAX];
        int numPreguntas;
        int desde,hasta;
        
        while((casos=in.nextInt())!=0){
            for (int i = 1; i <= casos; i++)
                energia[i]=in.nextInt() + energia[i-1];
            
            numPreguntas=in.nextInt();
            
            while(numPreguntas-->0){
                desde=in.nextInt();
                hasta=in.nextInt();
                System.out.println(energia[hasta]-energia[desde-1]);
            }
        }
    }
}