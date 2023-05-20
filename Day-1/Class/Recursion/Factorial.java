import java.util.Scanner;

public class Factorial {
    public static long Factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }
        
        if (n <= 1) {
            return 1;
        }
        
        return n * Factorial(n - 1);
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

