import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE BANK!");
        int depositAmount;
        int withdrawAmount ;
        double compoundedAmount = 0;
        int choice;
        int duration;
        double rate;
        char choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of account do you want?: ");
        System.out.print("1.Saving\n2.Open\n");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected to open a saving account.");
                System.out.println("Select the number of years you want to keep the deposit for: ");
                duration = scanner.nextInt();
                System.out.println("Enter the deposit amount: ");
                depositAmount = scanner.nextInt();
                if (depositAmount <= 0) {
                    System.out.println("Invalid deposit amount");
                } else if (depositAmount > 30000) {
                    rate = 3/100.0;
                    System.out.println("Since your amount is greater than 30000 your amount will be returned in " + duration + " years with 3% interest");
                    compoundedAmount = depositAmount*(Math.pow(rate+1.0,duration));
                } else {
                    System.out.println("Since your amount is smaller than 30000 your amount will be returned in " + duration + " years with 2% interest");
                    rate = 2/100.0;
                    compoundedAmount = depositAmount*(Math.pow(rate+1.0,duration));
                }
                System.out.println("Would you like to see the amount after interest?(Y/N)");
                choose=scanner.next().charAt(0);
                if(choose == 'Y') {
                    System.out.println("Amount after interest: " + compoundedAmount);
                }
                break;
            case 2:
                int balance=0;
                Open obj1=new Open(balance);
                System.out.println("You have selected an open account.");
                System.out.println("You can deposit and withdraw money at any given time");
                do {
                    System.out.println("Press 0 to exit 1 to continue");
                    choice = scanner.nextInt();
                    if(choice==0)
                    {
                        break;
                    }
                    if(balance==0)
                    {
                        System.out.println("Since your balance is zero you have to make a deposit!");
                        balance=obj1.depositAmount();
                    }
                    else{
                        System.out.println("Do you want to deposit more(1) or withdraw(2) or check balance(3)?");
                        choice = scanner.nextInt();
                        switch(choice) {
                            case 1:
                                balance=obj1.depositAmount();
                                break;
                                case 2:
                                    balance=obj1.withdrawAmount();
                                    break;
                            case 3:
                                obj1.displayBalance();
                                break;
                                    default:
                                        System.out.println("Something went wrong");
                                        break;
                        }


                    }

                }
                while (choice != 0);
        }
        }

    }


