import java.util.Scanner;
public class Ass {

	public static void main(String[] args) {
	Scanner abel = new Scanner(System.in);

	System.out.print("Enter first number");
	int x = abel.nextInt();
	System.out.print("Enter second number");
	int y = abel.nextInt();
	System.out.print("Enter third number");
	int z = abel.nextInt();
	
	int sum = (x + y + z);

	System.out.printf(" %d%n", sum);
	
	int ave = ((x + y + z) / 3);
	System.out.printf(" %d%n", ave);

	int product = (x * y * z);
	System.out.printf(" %d%n", product); 

	if(x >= y) {
	System.out.print("x is the larger y number");

	}
	if(x <= y) {
	System.out.print("y is the larger number");

	if(x > z) {
	System.out.print("z is the lowest number");
	}
}
}
}
	