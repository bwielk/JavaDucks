package ducks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RocketDuckTest {
	
	private RocketDuck rocket1;
	
	@Before
	public void before(){
		rocket1 = new RocketDuck();
	}
	
	@Test
	public void rocketDuckCannotQuack(){
		assertEquals("Cannot quack", rocket1.performQuacking());
	}
	
	@Test
	public void rocketDuckCannotFlyWithWings(){
		assertEquals("Cannot fly", rocket1.performFlying());
	}

}
