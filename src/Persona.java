// import java.util.Comparator;
// import java.util.Objects;

// Clase
public class Persona {
    
    private String nombre;
    private String apellido;
    
// Constructores
    public Persona(){}

    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido; 
    }

// Crear get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
    }

    // @Override
    // public int compare(Persona persona1, Persona persona2) {
    //     return (persona1.getNombre().compareTo(persona2.getNombre()));
    // }
  
}
