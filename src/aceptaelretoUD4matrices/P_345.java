package aceptaelretoUD4Matrices;

import java.util.Scanner;

public class P_345 {
    
    static boolean esSudoku(int [][] m){
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSudokus=in.nextInt();
        int sudoku [][]= new int [9][9];
        
        while(numSudokus-->0){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j]=in.nextInt();
                }
            }
            
            System.out.println(esSudoku(sudoku)?"SI":"NO");
        }
    }
}