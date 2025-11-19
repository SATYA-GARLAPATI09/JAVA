import java.util.Scanner;
public class purchaseCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What iteam you like to buy: ");
        String iteam = sc.nextLine();
        System.out.print("What is the price for each?: ");
        double price = sc.nextDouble();
        System.out.print("how many would you like?: ");
        int num =sc.nextInt();
        double total = num*price;

        System.out.println("you have bought "+ num +" "+ iteam+"s");
        System.out.println("you total is Rs"+total);
        
        
        
    }
}