package com.calculadora.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraApplicationTests {

	@Test
	public void testSomar() {
		assertEquals(5.0, Calculadora.somar(2.0, 3.0));
		assertEquals(-1.0, Calculadora.somar(-2.0, 1.0));
	}

	@Test
	public void testSubtrair() {
		assertEquals(1.0, Calculadora.subtrair(3.0, 2.0));
		assertEquals(-3.0, Calculadora.subtrair(-2.0, 1.0));
	}

	@Test
	public void testMultiplicar() {
		assertEquals(6.0, Calculadora.multiplicar(2.0, 3.0));
		assertEquals(-2.0, Calculadora.multiplicar(-1.0, 2.0));
	}

	@Test
	public void testDividir() {
		assertEquals(2.0, Calculadora.dividir(6.0, 3.0));
		assertThrows(ArithmeticException.class, () -> Calculadora.dividir(1.0, 0.0));
	}

}
