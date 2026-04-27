import java.util.Scanner;
public class  pattern5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the num of rows: ");
        int rows =sc.nextInt();
        System.out.println("enter the number of columns: ");
        int col = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=rows;j>i;j--){
                System.out.print("* ");
        
            
        }
             
            System.out.println();
    }
    
}}