import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
            

    System.out.println("This program will calculate the gratuity on a restaurant bill.\n \nEnter the cost of the meal:  \n");
    double mealSubTotal = scanner.nextDouble();
    System.out.println("\nEnter the gratuity percentage, example 15%, 20%...:  \n");

    int gratuity = scanner.nextInt();

    double totalBill = mealSubTotal + (mealSubTotal * (gratuity / 100));

    
    System.out.printf("\nThe meal cost without the gratuity is: $%.2f\n", mealSubTotal);

    System.out.println("\nThe gratuity is: " + gratuity + "%");
    
    System.out.printf("\nAnd the total bill is: $%.2f",  totalBill);


    //System.out.printf("\nThe meal cost without the gratuity is: %.2f" +
      //"\nThe gratuity is: %.2f%%" +
     // "\nAnd the total bill is: %.2f",
      //mealSubTotal, gratuity, totalBill);
    
   // System.out.printf("Formatted number: %.2f", number);
  }

  
}