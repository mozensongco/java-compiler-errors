package compilerErrors;

public class CompilerErrors {
	public final static int PERMANENT = 42;
	
	public void voidReturn() {
		return "hi";
	}
	
	public static void main(String[] args) {
		int x;
		int y = 0;
		double z = 0.00;
		String stuff;
		String num = 4;
		int a = "a"; // Both this and the previous line have mismatched types
		
		PERMANENT = 45;
		
		System.out.printf("%d %f\n", y, y); // Breaks because %f is not the format specifier for int y
		System.out.printf("%f %d", z, z); // Breaks because %d is not the format specifier for double z
		System.out.printf("%d %d %s", 4, x, stuff); // Neither x nor stuff is initialized
		System.out.printf("%f", y / z); // prints NaN
		
	}
	
	// Side notes: The compiler complains if there is no main method.
	// The compiler DOESN'T complain if you create a void method that returns something.
	// The compiler complains if you try to change a constant, or try to change a non-static variable as though it's static.
}
