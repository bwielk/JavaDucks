package ducks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RubberDuckTest extends RubberDuck {
	
	private RubberDuck rubber1;
	
	@Before
	public void before(){
		rubber1 = new RubberDuck();
	}
		
	@Test
	public void rubberDuckSqueaks(){
		assertEquals("I squeak like a rubber duck", rubber1.performQuacking());
	}

	@Test
	public void rubberDuckCannotFly(){
		assertEquals("Cannot fly", rubber1.performFlying());
	}
}
