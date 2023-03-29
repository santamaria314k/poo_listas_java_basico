
import java.util.Scanner;
                               
public class Persona {
    //atributos    PUBLICOS DE LA CLASE  PERSONA                                                                         
    public String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public Double peso;
    public Double estatura;
    public int edad;
    public String sexo;
//metodo void para ingresar los datos 
    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);
//UTILIZA EL OBJETO SCANNER PARA RECIBIR LOS DATOS Y LOS GUARDA EN LOS ATRIBUTOS                     
        System.out.print("Ingrese el tipo de documento:");
        tipoDoc = lectura.next();

        System.out.print("Ingrese el número de documento:");
        documento = lectura.nextInt();

        System.out.print("Ingrese el nombre:");
        nombre = lectura.next();

        System.out.print("Ingrese el apellido:");
        apellido = lectura.next();

        System.out.print("Ingrese el peso:");
        peso = lectura.nextDouble();

        System.out.print("Ingrese la altura:");
        estatura = lectura.nextDouble();

        System.out.print("Ingrese la edad:");
        edad = lectura.nextInt();

        System.out.print("Ingrese el sexo:");
        sexo = lectura.next();
//se cierra el OBJETO SCANNER 
        lectura.close();

}
//METODO UTILIZADO PARA MOSTRAR LOS DATOS QUE RECIBIO EN EL  METODO PEDIR DATOS
        public void mostrarPersona() {
  //MUESTRA LOS ATRIBUTOS Y SUS DATOS INGRESADOS         

System.out.println( tipoDoc );
System.out.println(documento);
System.out.println(nombre);
System.out.println(apellido);
System.out.println(peso);
System.out.println(estatura);
System.out.println(edad);
System.out.println(sexo);
System.out.println("     ");
        }
//METODO USADO PARA CALCULAR EL IMC Y MOSTRARLO 
public void calcularImc(){

  Double  pesoActual=peso/(estatura*estatura);
  
System.out.println("TU % DE IMC ES :"+pesoActual);

System.out.println("     ");
//UNA CONDICION DONDE SI EL PESO ACTUAL ES MENOR O IGUAL 20  MUESTRA EL  MENSAJE
if (pesoActual<=20) {System.out.println("EL PESO ESTA POR DEBAJO DE LO IDEAL");} 
//UNA CONDICION DONDE SI EL PESO ACTUAL ESTA ENTRE 20 Y 25 MUESTRA EL MENSAJE
        if (pesoActual>=20  && pesoActual<=25) {System.out.println("EL PESO ES IDEAL");} 
//UNA CONDICION DONDE SI EL PESO ACTUAL ES MAYOR A 25 ESTA EN SOBRE PESO
if(pesoActual>=25){ System.out.println("ESTAS EN SOBREPESO");}


}

//METODO VOID QUE CONTIERNE UN CONDICIONAL QUE DETERMINA QUE SI EL VALOR DIGITADO ES MAYOR A 18  ES MAYOR DE EDAD
public void mayorEdad(){
        if (edad>=18) {
                System.out.println("TU ERES MAYOR DE EDAD");
        } else {
              System.out.println("ERES MENOR DE EDAD");  
        }
}
  
}

