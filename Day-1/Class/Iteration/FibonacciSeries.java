import java.util.Scanner;

public class FibonacciSeries {
    public static void generateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Fibonacci series is undefined for non-positive numbers.");
        }
        
        int first = 0;
        int second = 1;
        
        System.out.print("Fibonacci series up to position " + n + ": ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
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
