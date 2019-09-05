import java.util.Scanner;
import java.lang.Math.*;

public class Tan {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	 
	System.out.print("enter radius");
	int radius = input.nextInt();
	
	
	System.out.printf("The diameter with radius %d is %d%n",radius, (radius * 2));
	System.out.printf("The circumference radius  %d is %f%n", radius, (2 * Math.PI * radius));
	System.out.printf("The area with radius %d is %f%n", radius, (Math.PI * (radius * radius)));

} // close void main

} // close public class
	