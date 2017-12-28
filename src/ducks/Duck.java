package ducks;

public class Duck {
	
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public String performFlying(){
		return flyBehaviour.fly();
	}
	
	public String performQuacking(){
		return quackBehaviour.quack();
	}

}
