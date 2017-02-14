
public class Cars extends Vehicle {
	private String color; 
	
	public Cars (int s, String c) {
		super(s); // super is your parent, so you just call super to recall the speed --> speed = s;
		this.color = c;  
	}
	
	public double payToll(){
		return 15 * 4; 
	}
	
	public String toString() {
		return "This is perfect cars, the speed keep in " + super.toString() + ", and the color is " + color; // it is not good for "super.speed"   				
	}
}



