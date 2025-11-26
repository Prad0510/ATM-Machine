import java.util.Scanner;

class ATM {
    float balance = 100000;
    int pin = 5654;

    public void checkpin() {
        System.out.println("Enter the pin: ");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if (entered_pin == pin) {
            menu();
        }
        else {
            System.out.print("Enter valid pin");
        }
    }

    public void menu() {

        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("Enter valid option number:");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();
        }
        else if (opt == 2) {
            withdrawMoney();
        }
        else if (opt == 3) {
            depositMoney();
        }
        else if (opt == 4) {
            return;
        }
        else {
            System.out.print("Enter valid option number");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter the amount to be withdrawn: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Successful Withdrawal");
        }
    }

    public void depositMoney() {
        System.out.println("Enter the amount to be depostied");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance = balance + amount;
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.checkpin();
    }
}
