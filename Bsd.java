import java.util.Scanner;

public class Bsd {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter integer1: ");
  int x = input.nextInt();

  System.out.print("Enter integer2: ");
  int y = input.nextInt();

  int remainder = x % y;

  if(remainder == 0 ) {
  System.out.printf("%d is a mulitple of %d%n", x, y);
}

  if(remainder != 0) {
  System.out.printf("%d is not a multiple of %d%n", x, y);
}
  
}
}