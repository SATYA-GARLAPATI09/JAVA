import java.util.Scanner;
public class user_input{
    public static void main(String[] args){
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name :");
        String name = scanner.nextLine();
        System.out.print("enter your age :");
        int age = scanner.nextInt();
        System.out.print("enter your cgpa :");
        double cgpa = scanner.nextDouble();
       
        System.out.println();
        

        System.out.println("");
        System.out.println("hi my name is : "+name);
        System.out.println("hi my age is : "+ age);
        System.out.println("hi my age is : "+ cgpa);


        // area of a rectangle

        System.out.print("enter the width: ");
        int width = scanner.nextInt();
        System.out.print("enter the length: ");
        int length = scanner.nextInt();
        System.out.println("the total area : " + (width * length));

        scanner.close();
    }
}