/*
 * 
 * 
 * 
 */
public class s02_Fraction {
	private int num, den; 
	
	// function whose name is same as class = constructor 
	// takes NO return type (not void)
	public s02_Fraction(int n, int d) {
		num = n; den= d; 
	}

	public String toString() {
	return num + "/" + den; // in Java
	} 


/*
// this will refer to the object 
public Fraction add(Fraction r) {
	// this .num represents r.num and this .den represnets r.den
	Fraction ans = new Fraction (this.num * r.den + this.den * r.num, this.den * r.den); 
	retrn ans; 
}
*/
// shorter !!
	public s02_Fraction add(s02_Fraction r) {
		return new s02_Fraction (this.num * r.den + den * r.num, den * r.den); // this.num is equal to .num
	}
	
	public s02_Fraction times(s02_Fraction x) {
		return new s02_Fraction (num * x.num, den * x.den); 
	}
	
	public s02_Fraction neg() {
		return new s02_Fraction (-num, den);
	}
	
	public static void main(String [] args) {
		
		s02_Fraction a = new s02_Fraction(1,2); // f1 = 1/2
		s02_Fraction b = new s02_Fraction(1,3); // f2 = 1/3
		s02_Fraction c = a.add(b);
		s02_Fraction d = new s02_Fraction(1,5);
		// c=a.add(x);
		System.out.println(c);  
		s02_Fraction f = a.times(b);
		System.out.println(d);
		//s02_Fraction e = a.div(b);
		s02_Fraction e = a.neg();
		System.out.println(f); 
		System.out.println (new s02_Fraction(1,2).add(a));   
		
		//Fraction f3 = f1 + f2; // only c++
		//Fraction f3 = f1.add(f2);
		//Fraction f4 = add(f1,f2);
		//System.out.println(f3);	
		//System.out.println(f4);		
	}
}

