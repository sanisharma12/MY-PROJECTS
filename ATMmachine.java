import java.util.Scanner;

class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        boolean running = true;

        while (running) {
            System.out.println("WELCOME TO SANI SHARMA's ATM MACHINE");
            System.out.println("CHOOSE ONE OPTION FROM BELOW");
            System.out.println("1 - WITHDRAW MONEY");
            System.out.println("2 - BALANCE ENQUIRY");
            System.out.println("3 - QUIT");

            int a = sc.nextInt();

            if (a == 1) {
                System.out.println("ENTER THE PIN ");
                int pin = sc.nextInt();
                if (pin == 1234) {
                    System.out.println("ENTER THE AMOUNT");
                    int amount = sc.nextInt();

                    if (amount > balance) {
                        System.out.println("INSUFFICIENT BALANCE");
                    } else {
                        balance -= amount;
                        System.out.println("MONEY IS WITHDRAWING...");
                        System.out.println("YOUR CURRENT BALANCE IS " + balance);
                    }
                } else {
                    System.out.println("WRONG PIN! PLEASE TRY AGAIN.\n");
                    continue; 
                }
            } 
            else if (a == 2) {
                System.out.println("ENTER PIN");
                int pin = sc.nextInt();
                if (pin == 1234) {
                    System.out.println("YOUR CURRENT BALANCE IS " + balance);
                } else {
                    System.out.println("WRONG PIN! PLEASE TRY AGAIN.\n");
                    continue; 
                }
            } 
            else if (a == 3) {
                System.out.println("THANK YOU FOR USING NIKIL's ATM. HAVE A NICE DAY!");
                running = false; 
            } 
            else {
                System.out.println("INVALID OPTION! PLEASE TRY AGAIN.\n");
            }

            System.out.println("\n-------------------------------------\n");
        }

        sc.close();
    }
}