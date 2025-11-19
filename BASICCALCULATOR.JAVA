import java.util.Scanner;
public class BASICCALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("WELCOME TO SANI SHARMA'S BASIC CALCULATOR");
            System.out.println("1-ADD");
            System.out.println("2-SUBTRACT");
            System.out.println("3-DIVIDE");
            System.out.println("4-MULTIPLY");
            System.out.print("Enter your choice: ");
            int a = sc.nextInt();

            System.out.print("Enter 1st number: ");
            int b = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int c = sc.nextInt();

            if (a == 1) {
                System.out.println("SUM OF NUMBERS IS " + (b + c));
            } else if (a == 2) {
                System.out.println("SUBTRACTION OF TWO NUMBERS IS " + Math.abs(b - c));
            } else if (a == 3) {
                if (c == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.println("DIVISION OF TWO NUMBERS IS " + (b / c));
                }
            } else if (a == 4) {
                System.out.println("MULTIPLICATION OF TWO NUMBERS IS " + (b * c));
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}