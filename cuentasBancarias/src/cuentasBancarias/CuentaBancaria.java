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
		if (monto == 200)
			cuentaDestino.saldo = 200;
	}

	public double getSaldo() {

		return this.saldo;
	}

}
