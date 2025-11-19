import java.util.Scanner;
public class practiceQ1{
    public static int MaxFinder(int[] arr) {
       if(arr.length==0){
        return -1;
       }
       else if(arr.length==1){
        int max = arr[0];
        return max;
       }
       else{
         int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
            {
                max = arr[i];
            }
        }
        return max;
       }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num of elelements in array: \n" );
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter the "+n+"elements: ");
        for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
        }
        System.out.println("you enterd: ");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
            
        }
        
        
        
      int m = MaxFinder(arr);
      System.out.print("the max number is : ");
      
      System.out.println(m);
      
        

    }
    
}