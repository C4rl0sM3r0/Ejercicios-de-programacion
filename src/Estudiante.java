// Subclase que hereda de Persona
public class Estudiante extends Persona {
    private String matricula;
    private double promedio;

    public Estudiante(String nombre, int edad, String correo, String matricula, double promedio) {
        super(nombre, edad, correo); // Llama al constructor de Persona
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Método que devuelve si está aprobado o no
    public boolean estaAprobado() {
        return promedio >= 7.0;
    }

    // Sobrescribimos mostrarInfo para incluir más datos
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobado: " + (estaAprobado() ? "Sí" : "No"));
    }

    // Getter y setter para modificar el promedio si el docente le asigna nota
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
