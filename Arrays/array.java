import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int ARR[]={20,30,40,60};
        System.out.println(ARR[0]);
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
            System.out.print(Arr[i] +" ");
            
        }
        
        
      sc.close();  
        
    }
    
}