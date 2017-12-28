package ducks;

public class RocketDuck extends Duck {
	
	public RocketDuck(){
		flyBehaviour = new NoFly();
		quackBehaviour = new NoQuack();
	}
}
