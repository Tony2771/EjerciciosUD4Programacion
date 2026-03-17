package aceptaelretoUd4Estructurasdinamicas;

import java.util.Scanner;
import java.util.Stack;

public class P_141 {
    
     static boolean equilibrada(String expresion){
        Stack<Character> pila=new Stack();
        
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if(expresion.charAt(i)=='{' || expresion.charAt(i) =='[' ||expresion.charAt(i) =='(')
                pila.push(c);
            else if (expresion.charAt(i)=='}' ||expresion.charAt(i)==']'||expresion.charAt(i)==')'){
                if(pila.isEmpty())
                    return false;
                else
                    pila.pop();
            }
            char ultimo=pila.pop();
            
            if(c=='('&& ultimo!=')') return false;
            if(c=='{'&& ultimo!='}') return false;
            if(c=='['&& ultimo!=']') return false;
        }
        return pila.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        String expresion =in.nextLine();
        System.out.println(equilibrada(expresion)?"YES":"NO");
        }
    }
}