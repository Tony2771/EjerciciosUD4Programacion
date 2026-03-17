package EstructurasdatosUD4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList(Arrays.asList("manzana","mora","uva","melon","pera"));
        String fruta;
        int contador=10;
        
        while(contador>0&&!lista.isEmpty()){
            
            if(lista.contains(fruta=in.next())){
                lista.remove(fruta);
                System.out.println("Acierto");
                System.out.println("Faltan " + lista.size() + " frutas por acertar");
            }
            else{
                contador--;
                System.out.println("Fallo");
                System.out.println("Faltan " + lista.size() + " frutas por acertar");
                System.out.println("Te quedan " + contador + " intentos.");
            }
        }
        if(lista.isEmpty())
            System.out.println("GANASTE");
        else
            System.out.println("PERDISTE");
        
    }

}