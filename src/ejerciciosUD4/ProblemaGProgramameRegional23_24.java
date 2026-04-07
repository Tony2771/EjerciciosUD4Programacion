package ejerciciosUD4;

import java.util.*;

public class ProblemaGProgramameRegional23_24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int desarrolladores,proyectos;
        String linea;
        HashSet <String>especialidad = new HashSet<>();
        String habilidades[];
        boolean esPosible;
        
        desarrolladores=in.nextInt();
        in.nextLine();//Vaciado enter
        while(desarrolladores-->0){
            linea=in.nextLine();
            habilidades=linea.split(" ");
            for (int i = 0; i < habilidades.length; i++)
                especialidad.add(habilidades[i]);
        }
        
        proyectos=in.nextInt();
        in.nextLine();
        while(proyectos-->0){
            esPosible=true;
            linea=in.nextLine();
            habilidades=linea.split(" ");
            for (int i = 1; i < habilidades.length; i++) {
                if(!especialidad.contains(habilidades[i])){
                    esPosible=false;
                    break;
                }
            }
            System.out.println(esPosible?"SI":"NO");
        }
    }
}