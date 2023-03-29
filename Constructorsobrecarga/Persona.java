
//nombre de la clase  
public class Persona {
    //atributos  
    private String nombre;
    public String apellido;
    private int edad;
//metodo constructor / con  los atributos nombre apellido y edad. 
    public Persona() {
        nombre = "antonio";
        apellido="rodriguez";
        edad = 33;
    }
// se utiliza el  this  y se  asignan los valores del parametro _nombre al  atributo  nombre.
    public Persona(String _nombre,String _apellido, int _edad ) {
        this.nombre = _nombre;
        this.apellido = _apellido;     
        this.edad = _edad;
    }

// es un método de acceso getter público que devuelve el valor del campo 
    public String getNombre() {
        return nombre;
    }
    

    public int getEdad() {
        return edad;
    }

   
}
