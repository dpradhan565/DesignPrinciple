package design.strucural.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovableAdapterImplTest {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable astonMartin = new AstonMartin();
		MovableAdapter astonMartinAdapter=new MovableAdapterImpl(astonMartin);
		assertEquals(astonMartinAdapter.getSpeed(), 431.30312, 0.00001);
	}
	@Test
	public void whenConvertingDOLLARToEURO_thenSuccessfullyConverted() {
		Movable astonMartin = new AstonMartin();
		MovableAdapter astonMartinAdapter=new MovableAdapterImpl(astonMartin);
		assertEquals(astonMartinAdapter.getPrice(), 18400.0, 0.01);
	}

}
