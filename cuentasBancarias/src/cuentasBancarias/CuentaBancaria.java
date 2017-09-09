package cuentasBancarias;

public class CuentaBancaria {

	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public CuentaBancaria() {

	}

	public void transferirMontoHacia(double monto, CuentaBancaria cuentaDestino) {
		this.saldo -= monto;
		cuentaDestino.saldo += monto;

	}

	public double getSaldo() {

		return this.saldo;
	}

}
