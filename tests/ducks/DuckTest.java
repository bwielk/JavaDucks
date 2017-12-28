package ducks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuckTest{
	
	private Duck duck1;
	
	@Before
	public void before(){
		duck1 = new MallardDuck();
	}

	@Test
	public void duck1CanFly() {
		assertEquals("I am flying", duck1.performFlying());
	}
	
	@Test
	public void duck1CanQuack(){
		assertEquals("Quack!", duck1.performQuacking());
	}

}
