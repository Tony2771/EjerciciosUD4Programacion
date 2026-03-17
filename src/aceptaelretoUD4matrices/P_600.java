package aceptaelretoUD4matrices;

import java.util.Scanner;

public class P_600 {
    static Scanner in = new Scanner(System.in);
    
    static void leer(int[][] m){
        for (int f = 0; f < m.length; f++) 
            for (int c = 0; c < m[f].length; c++)
                m[f][c] = in.nextInt();
    }
    
    static int[][] estadisticasFilas(int[][] m){
        int[][] res = new int[m.length][2];
        
        int min;
        int max;
        
        for (int f = 0; f < m.length; f++) {
            min = m[f][0];
            max = m[f][0];
            
            for (int c = 1; c < m[f].length; c++) 
                if (m[f][c] < min)
                    min = m[f][c];
                else if (m[f][c] > max)
                    max = m[f][c];
            
            res[f][0] = min;
            res[f][1] = max;
        }
        
        return res;
    }
    
    static int[][] estadisticasColumnas(int[][] m){
        int[][] res = new int[m[1].length][2];
        
        int min;
        int max;
        
        for (int c = 0; c < m[0].length; c++) {
            min = m[0][c];
            max = m[0][c];
            
            for (int f = 1; f < m.length; f++) 
                if (m[f][c] < min)
                    min = m[f][c];
                else if (m[f][c] > max)
                    max = m[f][c];
            
            res[0][c] = min;
            res[1][c] = max;
        }
        
        return res;
    }
    
    static boolean hayPuntosSillas(int[][] m){
        int[][] minMaxFilas = estadisticasFilas(m);
        int[][] minMaxColumnas = estadisticasColumnas(m);
        
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                if((m[f][c] == minMaxFilas[f][0] && m[f][c] == minMaxColumnas[1][c])||(m[f][c] == minMaxFilas[f][1] && m[f][c] == minMaxColumnas[0][c]))
                    return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int filas;
        int cols;
        
        int[][] m;
        
        while ((filas = in.nextInt()) != 0){
            cols = in.nextInt();
            m = new int[filas][cols];
            
            leer(m);
            
            System.out.println(hayPuntosSillas(m)? "SI" : "NO");
        }
    }
}