import java.util.Scanner;
public class string {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter First String :");
    String r=sc.nextLine();
    System.out.println("Enter Second String :");
    String s=sc.nextLine();
    String result=r+s;
    System.out.println("Result is : " + result);

    String str = "Hello";
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        reversed += str.charAt(i);
    }
    System.out.println("Reversed String: " + reversed);
    }
}

