import java.util.Scanner;
public class Open {
    int depositAmount;
    int withdrawAmount;
    int balance;
    Open(int bal) {
       balance = bal;
    }
    int depositAmount()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        depositAmount=scanner.nextInt();
        balance=balance+depositAmount;
        return balance;
    }
    int withdrawAmount() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter withdraw amount: ");
        withdrawAmount=scanner.nextInt();
        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - withdrawAmount;
        }
        return balance;
    }
    void displayBalance()
    {
        System.out.println("Balance: " + balance);
    }
}
