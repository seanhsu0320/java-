
public class sO2_Fraction {

			private int num, den; 
			
			public static int gcd(int a, int b) {
				if (b==0)
					return a; 
				return gcd(b, a % b); 
			}
			
			// function whose name is same as class = constructor
			// takes NO return type (not void)
			public sO2_Fraction() {
				den = 1; // fractions default to 0/1
			}
			
			public sO2_Fraction(int n, int d) {
				int g = gcd(n, d); 
				num = n/g; 
				den = d/g; 
			}
			
			public String toString() {
				return num + "/" + den; 
			}
			
			/*
			// this will refer to the object
			public sO2_Fraction add (sO2_Fraction add r) {
				sO2_Fraction ans = new sO2_Fraction(this.num * r.den + this.den * r.num, this.den * r.den); 
				return ans; 
			}
			*/
			//shorter way
			public sO2_Fraction add (sO2_Fraction r) {
				return new sO2_Fraction(num*r.den + r.num*den, den * r.den); 
			} 
			
			public sO2_Fraction times (sO2_Fraction x) {
				return new sO2_Fraction(num*x.num, x.den*den); 
			}
			
			public sO2_Fraction neg () {
				return new sO2_Fraction(-num, den); 
			}
			
			public static void main (String[] args) {
				sO2_Fraction a = new sO2_Fraction(1,2);
				sO2_Fraction b = new sO2_Fraction(1,3);
				sO2_Fraction c = a.add(b); 
				System.out.println(c);
				sO2_Fraction d = a.times(b); 
				System.out.println(d);;
				//s02_Fraction e = a.divd(b);
				sO2_Fraction f = a.neg();
				System.out.println(f);
				System.out.println(new sO2_Fraction(1,2).add(a));
				System.out.println(new sO2_Fraction(1,2).times(new sO2_Fraction(2,1)));
			}
}

