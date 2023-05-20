import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Factorial {
    private static Map<Integer, Long> factorialCache = new HashMap<>();
    
    public static long Factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }
        
        if (n <= 1) {
            return 1;
        }
        
        if (factorialCache.containsKey(n)) {
            return factorialCache.get(n);
        }
        
        long factorial = n * Factorial(n - 1);
        factorialCache.put(n, factorial);
        
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
