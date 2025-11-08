// Subclase que hereda de Persona
public class Docente extends Persona {
    private String registro;
    private String especialidad;

    public Docente(String nombre, int edad, String correo, String registro, String especialidad) {
        super(nombre, edad, correo);
        this.registro = registro;
        this.especialidad = especialidad;
    }

    // Método para asignar una calificación a un estudiante
    public void asignarCalificacion(Estudiante e, double nota) {
        e.setPromedio(nota); // cambia el promedio del estudiante
        System.out.println("Docente " + nombre + " asignó nota " + nota + " a " + e.nombre);
    }

    // Sobrescribimos mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Registro: " + registro);
        System.out.println("Especialidad: " + especialidad);
    }
}
