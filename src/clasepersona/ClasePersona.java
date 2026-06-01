package clasepersona;

public class ClasePersona {

    private String nombre;
    private int edad;

    public ClasePersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { 
            this.edad = edad;
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }

    
    public static void main(String[] args) {
        ClasePersona persona1 = new ClasePersona("Jorge Gómez", 22);
        ClasePersona persona2 = new ClasePersona("Robert Ruiz", 28);

        System.out.println("--- Información de las Personas ---");
        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}

