import java.util.Scanner;
public class PRINT_ALL{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the array : ");

int n = sc.nextInt();
int [] Arr = new int[n];
System.out.println("enter the "+n+" digits :" );
for(int i=0;i<n;i++){
Arr[i] =sc.nextInt();
}
System.out.print("you entered : ");
for(int i=0;i<n;i++){
    System.out.print(Arr[i]+" ");
    
}



}}