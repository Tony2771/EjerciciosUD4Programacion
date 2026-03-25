package EstructurasdatosUD4;

import java.util.Scanner;
import java.util.*;

public class Ejercicio48 {
    //Con vectores
    static boolean equilibrada(String expresion){
        char [] v = new char [expresion.length()];
        int cima=-1;
        
        for (int i = 0; i < expresion.length(); i++) {
            if(expresion.charAt(i)=='(')
                v[++cima]='(';
            else if (expresion.charAt(i)==')'){
                if(cima==-1)
                    return false;
                else
                    cima--;
            }
        }
        return cima==-1;
    }
    //Con pila
    static boolean equilibradaPila(String expresion){
        Stack<Character> pila=new Stack();
        
        for (int i = 0; i < expresion.length(); i++) {
            if(expresion.charAt(i)=='(')
                pila.push('(');
            else if (expresion.charAt(i)==')'){
                if(pila.isEmpty())
                    return false;
                else
                    pila.pop();
            }
        }
        return pila.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expresion =in.nextLine();
        
        
        System.out.println(equilibrada(expresion)?"SI":"NO");
        System.out.println(equilibradaPila(expresion)?"SI":"NO");
    }

}