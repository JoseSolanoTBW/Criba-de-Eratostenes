package com.negocio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.negocio.examen.CribaEratostenes;

import junit.framework.Assert;

public class CribaEratostenesTest {

	@Test
	public void poseeLaCantidadDeElementosEsperados() {
		int[] primos = CribaEratostenes.generaCriba(10);
		assertEquals(4, primos.length);
	}
	
	@Test
	public void tieneLosElementosEsperados() {
		int[] primos = CribaEratostenes.generaCriba(10);
		int[] expectedPrimos = new int[] {2,3,5,7};
		assertArrayEquals(expectedPrimos, primos);
	}

}
