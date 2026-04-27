import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        // 'col' input removed as it is not needed for a triangle based on row count
        
        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for printing stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // Use print(), not println()
            }
            System.out.println(); // Move to next line after printing row
        }
        sc.close();
    }
}