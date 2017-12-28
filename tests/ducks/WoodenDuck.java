package ducks;

public class WoodenDuck extends Duck {
	
	public WoodenDuck(){
		flyBehaviour = new NoFly();
		quackBehaviour = new NoQuack();
	}
}
