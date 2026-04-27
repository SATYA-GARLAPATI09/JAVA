import java.util.Scanner;
public class pattern8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("enter the number of rows: ");
         int n = sc.nextInt();
        
         for(int i=0;i<n;i++){
             for(int k =0;k<i;k++){
            System.out.print("  ");
            
        }
       
        for(int j=0;j < 2 * (n - i) - 1;j++){
            System.out.print("* ");
            
        }
    
        System.out.println();
        
       }
      sc.close();
        
    }
}