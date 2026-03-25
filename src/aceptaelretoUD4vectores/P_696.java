package aceptaelretoud4Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class P_696 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX=500000;
        int[] bares=new int[MAX];
        int n;
        int id;
        
        while(in.hasNext()){
            id=0;
            while((n=in.nextInt())!=0)
                bares[id++]=n;
            
            Arrays.sort(bares,0,id);
            
            for (int i = 1; i < id; i++)
                if(bares[i]==bares[i-1]+1){
                    System.out.println(bares[i-1]+1);
                    break;
                }
        }
    }
}