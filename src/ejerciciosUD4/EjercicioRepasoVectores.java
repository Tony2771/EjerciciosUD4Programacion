package ejerciciosUD4;

import java.util.Scanner;

public class EjercicioRepasoVectores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=in.nextInt();
        int diputados;
        
        while(casos-->0){
            String[] partidos= in.nextLine().split(" ");
            diputados=in.nextInt();
            int votos[]=new int [diputados];
            for (int i = 0; i < diputados; i++) {
                votos[i]=in.nextInt();
            }
        }
    }

}