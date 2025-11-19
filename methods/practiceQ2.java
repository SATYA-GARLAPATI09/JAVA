import java.util.Scanner;
public class practiceQ2{
    public static int targetcheck(int[] arr, int target) {
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(target ==(arr[i])){
                count++;
            }
        }
        return count;
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
        System.out.println("enter that seeing number: ");
        int target = sc.nextInt();
        int m = targetcheck(arr, target);
        
        System.out.println("the count of the target number occurance is "+m);
        
    }
    
}