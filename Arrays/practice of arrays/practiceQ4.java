import java.util.Scanner;

public class practiceQ4{
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
        int count =0;
        for(int i=1;i<n-1;i++){
            if(Arr[i]<Arr[i-1]){
                
                count++;
            }
        
        
        }
        if(count==0){
            System.out.println("Output: True");
            
        }else{
            System.out.println("Output: false");
        }
        
        
      sc.close();  
        
    }
    
}