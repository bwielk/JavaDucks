package ducks;

public class Duck {
	
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	public String performFlying(){
		return flyBehaviour.fly();
	}
	
	public String performQuacking(){
		return quackBehaviour.quack();
	}

}
