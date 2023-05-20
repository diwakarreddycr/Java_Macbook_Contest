import java.util.Scanner;

public class Factorial{
    public static long Factorial(int n) {
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long result = Factorial(number);
        
        System.out.println("The factorial of " + number + " is: " + result);
        
        scanner.close();
    }
}
