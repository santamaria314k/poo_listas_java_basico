

import java.util.Scanner;



public class Ejecusion {
 
    
public static void main(String[] args) {
    

Scanner sa=new Scanner(System.in);



Rectangulo cul=new Rectangulo(); 
Triangulo trr=new Triangulo(); 
Circulo cirr=new Circulo(); 
System.out.println("hola buen dia para ingresar al sitema ingresa tu nombre");
String ingreso =sa.nextLine();
while(ingreso == ingreso){
System.out.println("Hola para calcular el areade una figura digita su (#)");
System.out.println(" 1) Rectangulo    2) Triangulo   3)  Circulo    4) salir ");
int eleccion=sa.nextInt();



    
 

switch (eleccion) {
    case 1:
    System.out.println("Ha seleccionado rectangulo");
     System.out.println("debes ingresar el lado 1 ");
     Float aa=sa.nextFloat();
     cul.setLado(aa);
     

     
     System.out.println("debes ingresar el lado 2 ");
     Float bb=sa.nextFloat();
     cul.setLlado(bb);
     cul.CalcularArea();

     break;

        case 2:
        System.out.println("Ha seleccionado triangulo");
        System.out.println("ingresa la altura del triangulo");
        Float cc=sa.nextFloat();
        trr.setTri(cc);

        System.out.println("ingresa la base triangulo");
        Float dd=sa.nextFloat();
        trr.setTr(dd);

        trr.CalcularArea2();

            break;
            case 3:
            System.out.println("Ha seleccionado circulo");
            System.out.println("ingresa el radio del circulo");
        Float ee=sa.nextFloat();
        cirr.setRad(ee);

        cirr.CalcularArea1();

                break;
                case 4:
                
                    System.out.println("Ha seleccionado salir");
                
                    
                sa.close();
                
                    
break;


}






}



}}


