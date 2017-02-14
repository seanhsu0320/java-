
public class Coach extends Vehicle { // extends Vehicle to call Vehicle Object   
	private int numPassengers;
	
	public Coach (int s, int numP) {
		super(s); // speed = s; because you extends object to Vehicle 
		this.numPassengers = numP; 
	}
	public double payToll() {
		return 6; 
	}
	
	public String toString() {
		return "This is luxurious bus, the speed keeps in " + super.toString() + ", and the number of passengers are "+ numPassengers;   				
	}
}


