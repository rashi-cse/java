import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();          // Take String input
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();               // Take Integer input
        
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        
        sc.close();   // Good practice to close Scanner
    }
}