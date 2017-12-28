package ducks;

public class RubberDuck extends Duck {
	
	public RubberDuck(){
		flyBehaviour = new NoFly();
		quackBehaviour = new Squeak();
	}
}
