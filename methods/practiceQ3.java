import java.util.Scanner;
public class practiceQ3{
   public static boolean palindrome(int[] arr) {
    int n = arr.length;
    
    // Loop exactly half the array
    for (int i = 0; i < n / 2; i++) {
        
        // Compare Front (i) vs Back (n - 1 - i)
        // If they are NOT equal, it is impossible to be a palindrome
        if (arr[i] != arr[n - 1 - i]) {
            return false; // Stop immediately! (Efficient)
        }
    }
    
    // If we finish the loop, it means no mismatches were found
    return true;
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in a araya:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the "+n+"integers");
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("you enterd : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            System.out.println("\n");
            
            
        }
       boolean p = palindrome(arr);
        if (p){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not a palindrome");
            
        }
    }}
    
