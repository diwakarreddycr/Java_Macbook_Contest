import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) {
            return triangle;
        }
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            if (i > 0) {
                List<Integer> prevRow = triangle.get(i - 1);
                
                for (int j = 1; j < i; j++) {
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(sum);
                }
                
                row.add(1);
            }
            
            triangle.add(row);
        }
        
        return triangle;
    }
    
    public static void printTriangle(List<List<Integer>> triangle) {
        int numRows = triangle.size();
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }
            
            List<Integer> row = triangle.get(i);
            int rowSize = row.size();
            
            for (int j = 0; j < rowSize; j++) {
                System.out.print(row.get(j) + " ");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        List<List<Integer>> pascalTriangle = generatePascalTriangle(numRows);
        
        System.out.println("Triangle using Pascal's Triangle:");
        printTriangle(pascalTriangle);
        
        scanner.close();
    }
}
