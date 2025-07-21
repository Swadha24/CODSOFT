import java.util.Scanner;

class Atm {

    float balance;
    long pin = 9876;

    public void checkPin() {
        System.out.println("Enter your Pin");
        Scanner sc=new Scanner(System.in);
        long enterPin=sc.nextLong();
        if(enterPin==pin){
            menu();
        }
        else{
            System.out.println("Invalid Pin");
        }

        
    }

    public void menu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Balance");
        System.out.println("3.Deposit Balance");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        switch (opt) {
        case 1:
            System.out.println("Balance: " + balance);
            menu();
            break;
        case 2:
            System.out.println("Enter amount to withdraw: ");
            float withdrawAmount = sc.nextFloat();
            if (withdrawAmount > balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance -= withdrawAmount;
                System.out.println("Money Withdrawn Successfully");
            }
            menu();
            break;
        case 3:
            System.out.println("Enter amount to deposit: ");
            float depositAmount = sc.nextFloat();
            balance += depositAmount;
            System.out.println("Money Deposited Successfully");
            menu();
            break;
        case 4:
            System.out.println("Thank you for using the ATM!");
            break;
        default:
            System.out.println("Invalid Option");
            menu();
            break;
        }
    }
    
}

public class AtmInterface {
    public static void main(String[] args) {
        Atm a=new Atm();
        a.checkPin();
    }
}

