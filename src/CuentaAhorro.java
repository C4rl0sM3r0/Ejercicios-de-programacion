// Subclase que hereda de CuentaBancaria
public class CuentaAhorro extends CuentaBancaria {
    // Atributo adicional propio de una cuenta de ahorro
    private double interesAnual;

    // Constructor: llama al constructor de la superclase con "super"
    public CuentaAhorro(String numeroCuenta, String titular, double saldo, double interesAnual) {
        super(numeroCuenta, titular, saldo); // se inicializan los datos de la cuenta
        this.interesAnual = interesAnual;
    }

    // Método para aplicar el interés anual al saldo
    public void aplicarInteres() {
        double interes = getSaldo() * (interesAnual / 100);
        setSaldo(getSaldo() + interes);
        System.out.println("Interés aplicado: $" + interes);
    }

    // Sobrescribimos el método mostrarDatos para mostrar también el interés
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // muestra los datos de la clase padre
        System.out.println("Interés anual: " + interesAnual + "%");
    }
}
