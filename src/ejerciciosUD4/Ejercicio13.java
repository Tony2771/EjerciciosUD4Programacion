package ejerciciosUD4;

import java.util.Arrays;

public class Ejercicio13 {
    
    static boolean estaRepetido(int n,int v[],int i){
        for (int j = 0; j <=i; j++) {
            if(v[j] == n)
                return true;
        }
        return false;
    }
    
    static int[] generarBoleto(){
        //Crear un vector
        int[] v = new int[6];
        int n;
        //Rellenarlo
        //Generar los numeros hasta que no sean repetidos
        for (int i = 0; i < v.length; i++) {
            
            do{
                n = (int)(Math.random() * 49 + 1);
            }while(estaRepetido(n,v,i-1));
            v[i] = n;
        }
        //Devolverlo
        return v;
    }
    
    static int getAciertos(int ganador[],int boleto[]){
        int contador=0;
        
        for (int i = 0; i < boleto.length; i++) {
            if(esta(ganador,boleto[i]))
                contador++;
        }
        return contador;
    }
    
    static boolean esta(int ganador[],int boleto){
        
        for (int i = 0; i < ganador.length && ganador[i]<=boleto; i++) {
            if(ganador[i]==boleto)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        //[1,49]
        int ganador[] = generarBoleto();
        //Ordenamos el vector ganador para acelerar las busquedas
        Arrays.sort(ganador);
        
        int [] boleto;
        int[] aciertos = new int[7];
        
        for (int i = 0; i < 10000000; i++) {
            boleto = generarBoleto();
            aciertos[getAciertos(ganador,boleto)]++;
        }
        
//        Arrays.sort(boleto);
//        System.out.println(Arrays.toString(boleto));
    }
}