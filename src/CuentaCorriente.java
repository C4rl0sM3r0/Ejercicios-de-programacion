// Subclase que hereda de CuentaBancaria
public class CuentaCorriente extends CuentaBancaria {
    // Atributo adicional propio de una cuenta corriente
    private double limiteCredito;

    // Constructor con llamada al constructor padre
    public CuentaCorriente(String numeroCuenta, String titular, double saldo, double limiteCredito) {
        super(numeroCuenta, titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    // Sobrescribimos el método retirar para permitir usar crédito
    @Override
    public void retirar(double monto) {
        double disponible = getSaldo() + limiteCredito; // saldo + crédito disponible
        if (monto > 0 && monto <= disponible) {
            setSaldo(getSaldo() - monto); // puede quedar en negativo
            System.out.println("Retirado: $" + monto + " (usando crédito si es necesario)");
        } else {
            System.out.println("No se puede retirar: supera el límite de crédito.");
        }
    }

    // Mostramos también el límite de crédito al imprimir los datos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Límite de crédito: $" + limiteCredito);
    }
}
