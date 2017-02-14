
public class TestVehicles {
	public static void main (String [] args) {
		Cars c = new Cars(60, "Balck");
		Coach numP = new Coach (40, 125); 
		Truck t = new Truck (40, 2000.123); 
		
		System.out.println(c);
		System.out.println(numP);
		System.out.println(t);
		
		//Vehicle v = c; // single pay toll
		//System.out.println(v.payToll());
		//v = t; 
		
		// that is called "polymorphism" ... different objects, you can call them and print them
		Vehicle[] vehicles =  new Vehicle[3]; 
		vehicles [0] = c;  
		vehicles [1] = numP; 
		vehicles [2] = t;
		
		for (int i=0; i < vehicles.length; i++)
			System.out.println( vehicles[i].payToll() + " ");
		
	}
}
