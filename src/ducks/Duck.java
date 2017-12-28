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
	
	public void setFlyingBehaviour(FlyBehaviour fb){
		this.flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb){
		this.quackBehaviour = qb;
	}
}
