import java.util.Scanner;
public class practicQ1{
    public static void main(String[] args) {
        // Creates an array of size 5, all initialized to 0

        int arr[] ={10,50,30,70,80};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the nuber to search in array: ");
        int num = sc.nextInt();
        for(int i =0; i<5; i++){
            if(arr[i]==num){
                System.out.println("found at index "+ i );
                
            }
        }

        
    }
    
}