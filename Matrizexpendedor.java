import java.util.Scanner;
//nombre de la clase matrizexpendedor /matriz de una maquina expendedora
public class Matrizexpendedor {
//se crea un  matriz privada  que almacena los datos de los nombres de los productos 
    private static String[] productos = {"papas margarita", "galletas wafer", "chocolatina jet",  "chicles adams","chocorramo","agua cristal ","cola cola","doritos","saviloe","vive 100","postobon manzana","galletas moo","ponymalta","malta leona","takis","tostakos"};
//se crea un  matriz privada  que almacena la cantidad de p0roductos
    private static int[][] inventario = {{10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}, {10}}; 
//se crea un  matriz privada  que almacena el precio
    private static int[][] precios = {{1500}, {800}, {1000}, {600}, {800}, {1300}, {1500}, {1700}, {1200}, {800}, {700}, {1600}, {1100}, {900}, {4500}, {2500}}; 

    public static void main(String[] args) {
        //objeto scanner
        Scanner imprimir = new Scanner(System.in);
        //variable de tipo entero que por el momento tiene el valor de 0
        int seleccion = 0;
        //variable que almacena los datos de 3 registros 
        int[] comprados = {0, 0, 0};

        System.out.println("Buen dia en este momento  tenemos lo siguiente");
        //se inicializa un bucle que es infinito
        while (true) {
            System.out.println("Productos disponibles  :");
            //cuando productos tenga un valor se iniciara el bucle for
            for (int i = 0; i < productos.length; i++) {
                //se incrementara el contador mostrara los datos que hay en la variable productos precios y inventario
                System.out.println((i + 1) + ". " + productos[i] + " ($" + precios[i][0] + ", " + inventario[i][0] + " cant prod disponibles)");
          
          System.out.println("");
            }
           
           
            System.out.println("Ingrese el número del producto para comprarlo ( # 0 para TERMINAR):");
            seleccion = imprimir.nextInt();
//condicion donde se le pide al usuario que si desea terminar digite 0 al cumplirse dice gracias y muestra  con un for los productos comprados
            if (seleccion == 0) {
                System.out.println("Gracias :)");

                System.out.println("Productos comprados:");
               
               
               
                for (int i = 0; i < productos.length; i++) {
                    if (comprados[i] > 0) {
                        System.out.println(comprados[i] + " unidades del " + productos[i]);
                    }
                }

              
              
              //el break rompe la condicion
                break;


            }
//condicion que muestra el precio de los productos y pide el dinero
            if (seleccion > 0 && seleccion <= productos.length && inventario[seleccion - 1][0] > 0) {
                System.out.println("Ingrese el dinero $" + precios[seleccion - 1][0] + ":");
                int dinero = imprimir.nextInt();

               
//condicion que muestra la eleccion
               
                if (dinero >= precios[seleccion - 1][0]) {
                    System.out.println("has elegido  : " + productos[seleccion - 1] );

                    inventario[seleccion - 1][0]--;
                    comprados[seleccion - 1]++;
                } 
                else {
                    System.out.println("NO HAY DINERO SUFICIENTE, Intenta de nuevo");
                }
            } else {
                System.out.println("NO SE HA ENCONTRADO ,Intenta de nuevo");
            }
        }
//se cierra el objeto scanner
        imprimir.close();
    }
}


