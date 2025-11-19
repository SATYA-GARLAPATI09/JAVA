import java.util.Scanner;

public class practiceQ5{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("eneter the number of elements in array: " );
        int n = sc.nextInt();
        int [] Arr = new int[n];
        System.out.println("eneter the "+n+" elements");
        
        for(int i=0;i<n;i++){
            
            Arr[i] = sc.nextInt();
            
        }

        System.out.println("you enterd:");
        for(int i=0;i<n;i++){
            System.out.print(Arr[i] +" \n");
            
        }
        System.out.println("the reverse array: ");
        for(int i =n-1;i>=0;i--){
            System.out.println(Arr[i]+" ");
            
        }
        
        
        
      sc.close();  
        
    }
    
}