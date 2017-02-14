
public class Bus {
	private int speed; 
	private double weight;
	private String color;
	private int numPassengers;
	
	public Bus (int s, double w, String c, int numP) {
		speed = s; 
		weight = w; 
		this.color = c;  
		this.numPassengers = numP; 
	}
	
	public String toString() {
		return "This is luxurious bus, the speed keeps in" + speed + ", the weight of bus is " + weight + ", its color is " + color + ", and carrying is " + numPassengers;   				
	}
}

