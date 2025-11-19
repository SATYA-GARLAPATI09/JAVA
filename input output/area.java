import java.util.Scanner;
public class area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the width: ");
        double width = sc.nextDouble();
        System.out.print("eneter the length: ");
        double length = sc.nextDouble();
        System.out.println("area of the rectangle :" + width*length);
        
    }
    
}