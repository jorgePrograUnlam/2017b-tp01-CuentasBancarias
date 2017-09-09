package cuentasBancarias;

public class CuentaBancaria {

	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public CuentaBancaria() {

	}

	public void transferirMontoHacia(double monto, CuentaBancaria cuentaDestino) {
		if (monto == 100)
			cuentaDestino.saldo = 100;
	}

	public double getSaldo() {

		return this.saldo;
	}

}
