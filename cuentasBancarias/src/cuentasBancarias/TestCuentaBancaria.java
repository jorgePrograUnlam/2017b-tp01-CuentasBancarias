package cuentasBancarias;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCuentaBancaria {

	@Test
	public void transferirCero() {

		CuentaBancaria cuentaOrigen = new CuentaBancaria();
		CuentaBancaria cuentaDestino = new CuentaBancaria();

		cuentaOrigen.transferirMontoHacia(0, cuentaDestino);

		assertEquals(cuentaOrigen.getSaldo(), cuentaDestino.getSaldo(), 0.001);
	}

	@Test
	public void transferirCien() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(100);
		CuentaBancaria cuentaDestino = new CuentaBancaria(0);

		cuentaOrigen.transferirMontoHacia(100, cuentaDestino);

		assertEquals(100, cuentaDestino.getSaldo(), 0.001);
	}
	
	@Test
	public void transferirDoscientos() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(200);
		CuentaBancaria cuentaDestino = new CuentaBancaria(0);

		cuentaOrigen.transferirMontoHacia(200, cuentaDestino);

		assertEquals(200, cuentaDestino.getSaldo(), 0.001);
	}
	
	@Test
	public void transferirReduceSaldo() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(500);
		CuentaBancaria cuentaDestino = new CuentaBancaria(0);

		cuentaOrigen.transferirMontoHacia(100, cuentaDestino);

		assertEquals(400, cuentaOrigen.getSaldo(), 0.001);
	}
	
	@Test
	public void montoNegativo() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(500);
		CuentaBancaria cuentaDestino = new CuentaBancaria(0);

		cuentaOrigen.transferirMontoHacia(-100, cuentaDestino);

		assertEquals(500, cuentaOrigen.getSaldo(), 0.001);
	}
	


}