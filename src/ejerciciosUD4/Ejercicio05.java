package ejerciciosUD4;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        final int MAX=1000000;
        int[] contadores=new int[7];
        
        for (int i = 0; i < MAX; i++) {
            contadores[(int)(Math.random()*6+1)]++;
        }
        
        //Numero de veces que salio cada numero
        for (int i = 1; i < 7; i++) {
            System.out.println(i + ":" + contadores[i]);
        }
        
        for (int i = 1; i < 7; i++) {
            System.out.println(i + ":" + contadores[i]*100D/MAX + "%");
        }
    }

}