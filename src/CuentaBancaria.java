// Superclase que representa una cuenta bancaria general
public class CuentaBancaria {
    // Atributos comunes para todas las cuentas
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor para inicializar los atributos
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double monto) {
        if (monto > 0) { // Solo se permite depositar montos positivos
            saldo += monto;
            System.out.println("Depositado: $" + monto);
        } else {
            System.out.println("Monto inválido para depósito.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retirado: $" + monto);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    // Método que muestra los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + saldo);
    }

    // Métodos get y set para acceder o modificar los atributos
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
