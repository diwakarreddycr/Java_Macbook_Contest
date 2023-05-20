import java.util.Scanner;

public class PascalTriangle {
    public static int[][] generatePascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];
        
        for (int i = 0; i < numRows; i++) {
            triangle[i][0] = 1;
            
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        
        return triangle;
    }
    
    public static void printTriangle(int[][] triangle) {
        int numRows = triangle.length;
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        int[][] pascalTriangle = generatePascalTriangle(numRows);
        
        System.out.println("Triangle using Pascal's Triangle:");
        printTriangle(pascalTriangle);
        
        scanner.close();
    }
}
