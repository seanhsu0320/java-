
public class Car {
	private int speed; 
	private double weight;
	private String color; 
	
	public Car (int s, double w, String c) {
		speed = s; 
		weight = w; 
		this.color = c;  
	}
	
	public String toString() {
		return "This is perfect car, the speed is" + speed + ", the weight is " + weight + ", and the color is " + color;   				
	}
}

