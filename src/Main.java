//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        // ==========================
        // 🏦 EJERCICIO 1 — SISTEMA BANCARIO
        // ==========================
        System.out.println("========= SISTEMA BANCARIO =========");

        // Creamos una cuenta de ahorro
        CuentaAhorro ahorro = new CuentaAhorro("001", "Ana Pérez", 1000, 3.5);

        // Creamos una cuenta corriente
        CuentaCorriente corriente = new CuentaCorriente("002", "Luis Gómez", 500, 300);

        System.out.println("\n=== CUENTA DE AHORRO ===");
        ahorro.mostrarDatos(); // muestra datos iniciales
        ahorro.depositar(200); // deposita dinero
        ahorro.retirar(100);   // retira dinero
        ahorro.aplicarInteres(); // aplica el interés anual
        ahorro.mostrarDatos(); // muestra datos actualizados

        System.out.println("\n=== CUENTA CORRIENTE ===");
        corriente.mostrarDatos(); // muestra datos iniciales
        corriente.retirar(700);   // retira más del saldo, usa crédito
        corriente.mostrarDatos(); // muestra el nuevo estado

        // ==========================
        // 🏫 EJERCICIO 2 — SISTEMA ESCOLAR
        // ==========================
        System.out.println("\n\n========= SISTEMA ESCOLAR =========");

        // Creamos un estudiante
        Estudiante estudiante = new Estudiante(
                "María López",
                19,
                "maria.lopez@example.com",
                "MAT-2025-01",
                6.5
        );

        // Creamos un docente
        Docente docente = new Docente(
                "Carlos Ruiz",
                40,
                "c.ruiz@instituto.edu",
                "DOC-101",
                "Matemáticas"
        );

        // Validar correo del estudiante
        estudiante.validarCorreo();

        // Mostrar datos antes de calificación
        System.out.println("\n--- Datos del estudiante antes ---");
        estudiante.mostrarInfo();

        // Docente asigna una calificación
        System.out.println("\n--- Asignando calificación ---");
        docente.asignarCalificacion(estudiante, 8.5);

        // Mostrar datos después
        System.out.println("\n--- Datos del estudiante después ---");
        estudiante.mostrarInfo();

        System.out.println("\n========= FIN DEL PROGRAMA =========");
    }
}
