import java.util.Scanner;
//clase Notaarrays que es usada para sacar el promedio con arrays
public class Notaarrays {
    public static void main(String[] args) throws Exception {
        //objeto scanner
        Scanner imprimir = new Scanner(System.in);
//pide la cantidad de notas para usar la variable i en el for
        System.out.println("CANTIDAD DE NOTAS QUE SE VAN A EVALUAR");
        int i = imprimir.nextInt();
//secrea un array co9n una variable notas y con una capacidad de i que es la cantidad de notas 
        double[] notas = new double[i];
//for que inicia con  un valor de 0 y llaga a la cantidad de notas
        for (int p = 0; p < i; p++) {
            //recibe las notas
            System.out.println("INGRESA LA NOTA DE LA ASIGNATURA " + (p + 1));
            notas[p] = imprimir.nextDouble();
        }

        double acumulador = 0;
        for (int p = 0; p < i; p++) {
            //secrea un acumulador para sumar las notas  
            acumulador += notas[p];
        }
        //operacion donde  se divide al acumulador que es la suma de las notaS  ENTRE la cantidad de notas
        double promedio = acumulador / i;
        System.out.println("Promedio: " + promedio);
//condicional para determinar con base a los resultados en que posicion esta
        if (promedio < 3) {
            System.out.println("REPROBASTE :C CON UNA NOTA DE : " + promedio);
        } else if (promedio >= 3 && promedio < 4.0) {
            System.out.println("PASASTE RASPANDO CON UNA NOTA DE: " + promedio);
        } else {
            System.out.println("APROBASTE CON BUENOS RESULTADOS CON UNA NOTA DE: " + promedio);
        }
        //cierra objeto scanner
        imprimir.close();
    }
}


