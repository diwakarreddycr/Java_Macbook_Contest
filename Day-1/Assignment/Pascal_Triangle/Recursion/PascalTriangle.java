import java.util.Scanner;

public class PascalTriangle {
    public static int[][] generatePascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = calculatePascalValue(i, j);
            }
        }
        
        return triangle;
    }
    
    public static int calculatePascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return calculatePascalValue(row - 1, col - 1) + calculatePascalValue(row - 1, col);
        }
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
