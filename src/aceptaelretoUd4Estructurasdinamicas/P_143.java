package aceptaelretoUd4Estructurasdinamicas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class P_143 {
    static Scanner in = new Scanner(System.in);
    
    public static boolean leerTortitas(Stack<Integer>pila){
        int numero;
        pila.clear();
        
        while((numero=in.nextInt())!=-1){
            pila.push(numero);
        }
        
        return !pila.isEmpty();
    }
    
    public static void darVueltas(Stack<Integer>pila,int nVueltas){
        ArrayList<Integer> lista = new ArrayList();
        int numTortitas;
        
        while(nVueltas-->0){
            numTortitas=in.nextInt();
            
            for (int i = 0; i < numTortitas; i++) {
                lista.add(pila.pop());
            }
            
            for (int i = 0; i < numTortitas; i++) {
                pila.push(lista.get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> pila=new Stack();
        
        while(leerTortitas(pila)){
            darVueltas(pila,in.nextInt());
            System.out.println(pila.pop());
        }
    }
}