import java.util.Scanner;

public class one {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("Enter third number: ");
    int c = sc.nextInt();
    System.out.println("Addition is: " + (a + b));
    System.out.println("Subtraction is: " + (a - b));
    System.out.println("Multiplication is: " + (a * b));
    System.out.println("Division is: " + (a / b));
    System.out.print("Enter any number: ");
    int x = sc.nextInt();
    if(x % 2 == 0) {
      System.out.println("x is even.");
    } else {
      System.out.println("x is odd.");
    }
    if(a > b && a > c) {
      System.out.println("a is greater.");
    } else if(b > a && b > c) {
      System.out.println("b is greater.");
    } else{
      System.out.println("c is greater.");
    }
  }
}
