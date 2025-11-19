
import java.util.Scanner;
public class practiceQ3{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of elements in array: ");
      int n = sc.nextInt();
      int  [] arr= new int[n];
      System.out.println("enter the "+n+"numbers:");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
   
        
      }System.out.println("you enterd:");
      for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        

   
        
      }
      
            int count=0;
            int oddcount=0;
      for (int i=0;i<n;i++){
        if(arr[i]%2==0){
      
            count++;
        }
        else{
            oddcount++;
        }
      }
        System.out.println("Even numbers: "+count);
        System.out.println("Odd numbers: "+oddcount);
        
    }
    
}