
public abstract class Vehicle {
	private int speed; 
	
	public Vehicle (int s) {
		speed = s; 
	}
	
	public abstract double payToll(); // this abstract object, so you have to know what the definition here ; 
	
	public String toString() {
		return "" + speed;   				
	}
}

