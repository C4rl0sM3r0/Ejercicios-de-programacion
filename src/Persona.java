// Superclase que representa a una persona genérica
public class Persona {
    protected String nombre;
    protected int edad;
    protected String correo;

    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // Método que imprime los datos generales
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }

    // Método para validar si el correo es correcto
    protected void validarCorreo() {
        if (correo != null && correo.contains("@")) {
            System.out.println("Correo válido: " + correo);
        } else {
            System.out.println("Correo inválido: " + correo);
        }
    }
}
