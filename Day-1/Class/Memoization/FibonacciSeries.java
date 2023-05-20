import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeries {
    private static Map<Integer, Integer> fibonacciCache = new HashMap<>();
    
    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Fibonacci series is undefined for non-positive numbers.");
        }
        
        if (n == 1 || n == 2) {
            return 1;
        }
        
        if (fibonacciCache.containsKey(n)) {
            return fibonacciCache.get(n);
        }
        
        int fibNMinus1 = fibonacci(n - 1);
        int fibNMinus2 = fibonacci(n - 2);
        int fibN = fibNMinus1 + fibNMinus2;
        
        fibonacciCache.put(n, fibN);
        
        return fibN;
    }
    
    public static void generateFibonacci(int n) {
        System.out.print("Fibonacci series up to position " + n + ": ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of positions: ");
        int number = scanner.nextInt();
        
        generateFibonacci(number);
        
        scanner.close();
    }
}
