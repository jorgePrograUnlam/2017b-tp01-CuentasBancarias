package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaBancaria {

	@Test
	public void transferirCero() {

		CuentaBancaria cuentaOrigen = new CuentaBancaria();
		CuentaBancaria cuentaDestino = new CuentaBancaria();

		cuentaOrigen.transferirMontoHacia(0, cuentaDestino);

		assertEquals(cuentaOrigen.getSaldo(), cuentaDestino.getSaldo(),0.001);
	}

}