
public class Truck extends Vehicle { // a truck is a kind of VEHICLE
	// A TRUCK IS A VEHICLE
	private int speed; 
	private double weight;
	
	public Truck (int s, double w) {
		super (s); // not like "speed = s" 
		weight = w; 
	}
	
	public double payToll() { 
		return 10;
	}
	
	public String toString() {
		return "This is luxurious truck, the speed keeps in " + super.toString() + ", and the weight of the bus is " + weight;   				
	}
}

