package cuentasBancarias;

import org.junit.Test;

public class TestCuentaBancaria {

	@Test
	public void transferirCero() {

		CuentaBancaria cuentaOrigen = new CuentaBancaria();
		CuentaBancaria cuentaDestino = new CuentaBancaria();

		cuentaOrigen.transferirMontoHacia(0, cuentaDestino);

		assertEquals(cuentaOrigin.getSaldo(), cuentaDestino.getSaldo());
	}

}