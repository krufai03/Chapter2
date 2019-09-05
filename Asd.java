import java.util.Scanner;

public class Asd {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter integer: ");
  int x = input.nextInt();

  if(x %2 == 0 ) {
  System.out.print("you entered an even number");
}

   if(x %2 != 0 ) {
  System.out.print("you entered a odd number");
}
 
  
}
}