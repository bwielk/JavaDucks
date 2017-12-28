package ducks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WoodenDuckTest {

	private WoodenDuck woody;
	
	@Before
	public void before(){
		woody = new WoodenDuck();
	}

	@Test
	public void woodyCannotFly() {
		assertEquals("Cannot fly", woody.performFlying());
	}
	
	@Test
	public void woodyCannotQuack(){
		assertEquals("Cannot quack", woody.performQuacking());
	}

}
