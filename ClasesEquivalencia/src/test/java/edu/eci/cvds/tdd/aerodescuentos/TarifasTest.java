package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
	
	private CalculadorDescuentos calcularDescuentos = new CalculadorDescuentos();
	
	@Test
    public void fifteenOffTest() {
		
		long calculated = (long) CalculadorDescuentos.calculoTarifa(2350000, 25, 22);
		
		Assert.assertEquals(calculated, 1997500);

    }
    
	@Test
    public void fiveOffTest() {
		
		long calculated = (long) CalculadorDescuentos.calculoTarifa(3000000, 5, 15);
		
		Assert.assertEquals(calculated, 2850000);

    }
	
	@Test
    public void eigthOffTest() {
		
		long calculated = (long) CalculadorDescuentos.calculoTarifa(1500000, 9, 69);
		
		Assert.assertEquals(calculated, 1380000);

    }
	
	@Test
    public void twentyOffTest() {
		
		long calculated = (long) CalculadorDescuentos.calculoTarifa(500000, 26, 14);
		
		Assert.assertEquals(calculated, 400000);

    }
	
	@Test
    public void twentyThreeOffTest() {
		
		long calculated = (long) CalculadorDescuentos.calculoTarifa(1845000, 35, 70);
		
		Assert.assertEquals(calculated, 1420650);

    }
	
	@Test
    public void noOffTest() {
		
		long calculated = (long) CalculadorDescuentos.calculoTarifa(1234567, 8, 35);
		
		Assert.assertEquals(calculated, 1234567);

    }
}