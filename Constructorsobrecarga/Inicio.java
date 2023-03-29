//nombre de la clase donde se van a ejecutar los metodos constructores
public class Inicio {


    
    
    public static void main(String[] args) {
        //se  crean dos objetos   uno para el constructor con parametros y otro para el que no tine tienen el mismo nombre

        Persona persona = new Persona();
        Persona persona1 = new Persona(null, null, 0);

        System.out.println("1.datos ingresados: nombre   " + persona.getNombre() +"  apellido  "+persona.apellido+"  , edad " + persona.getEdad());
        System.out.println("2.datos ingresados: nombre   " + persona1.getNombre() +"  apellido  "+persona1.apellido +",   edad " + persona1.getEdad());
    
      //  llamada al método getNombre() del objeto persona de la clase Persona. El método es un método de acceso getter público que devuelve el valor del campo  de la clase Persona.
    
    
    
    }










    }

