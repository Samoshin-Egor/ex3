package Practice3;
import java.lang.*;
import java.util.Scanner;
public class Convertor {
    public static void main(String []args ){
        double dollar,euro, rubles;
        int choice;
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите валюту:");
        System.out.println("Enter 1: rubles");
        System.out.println("Enter 2: dollars");
        System.out.println("Enter 3: euros");
        System.out.print("Choose from above options: ");
        choice = sc.nextInt();
        System.out.print("Enter the amount you want to convert: ");
        amount = sc.nextFloat();
        switch (choice)
        {
            case 1: // rubles
                dollar = amount/62;
                System.out.println("dollars " + dollar);
                euro = amount/60.8;
                System.out.println("euro "+ euro);
            case 2: //dollars
               rubles = amount * 62;
               System.out.println("rubles "+rubles);
               euro = amount * 1.03;
               System.out.println("euro "+euro);
            case 3: // euro
                rubles = amount*62;
                System.out.println("rubles "+ rubles);
                dollar = amount*0.97;
                System.out.println("dollars "+dollar);
        }
    }
}
