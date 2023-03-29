import java.util.Scanner;
// clase Piscinaarrays   tiempos de llegada en una competicion de natacion con arrays
public class Piscinaarrays {
//metodo  main
    public static void main(String[] args) {
//objeto scanner
        Scanner imprimir = new Scanner(System.in);
//guarda en una variable de tipo entero la cantidad de competidores
        System.out.println("Ingrese la cantidad de competidores que participaron en la competencia:");
        int n = imprimir.nextInt();
//guarda en una variable de tipo string los nombres de cada participante
        String[] nombres = new String[n];
      //  guarda en una variable de tipo double los timpos  de cada participante
        double[] tiempos = new double[n];
        //es una variable que se inicia por el valor mas grande y luego se va actualizando 
        double mejorTiempo = Double.MAX_VALUE;
        //se inicia una variable para que tome el nombre del ganador
        String ganador = "";
//for que  marca su limite en la cantidad de competidores que se  registraron
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del competidor " + (i+1) + ":");
            nombres[i] = imprimir.next();

            System.out.println("Ingrese el tiempo del competidor " + (i+1) + ":");
            tiempos[i] = imprimir.nextDouble();
//condicion para determinar quien es el ganador
            if (tiempos[i] < mejorTiempo) {
                mejorTiempo = tiempos[i];
                ganador = nombres[i];
            }  
        }
     //   muestra quien es el ganador y cuando se demoro
        System.out.println("El ganador es " + ganador + " con un tiempo de " + mejorTiempo + " segundos.");
//cierra el objeto scanner
        imprimir.close();    }
   
}