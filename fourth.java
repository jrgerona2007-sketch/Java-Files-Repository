import java.util.Scanner;
//The user starts with a balance of ₱10,000.
//[1] Withdraw[2] Deposit[3] Check Balance[4] Exit
//Perform the chosen action and update the balance accordingly. 
//Withdrawal should check if the balance is sufficient.
public class fourth {
public static void main(String[] args) {
Scanner inp = new Scanner (System.in);
System.out.println("Welcome to the ATM");
System.out.println("Your starting balance is: ₱10,000");
System.out.println("Choose an action:");
System.out.println("[1] Withdraw");
System.out.println("[2] Deposit");
System.out.println("[3] Check Balance");
System.out.println("[4] Exit");
int choice = inp.nextInt();
double bal = 10000;
switch (choice){
    case 1: 
    System.out.print("Enter amount to withdraw: ₱");
    double wdraw = inp.nextDouble();
    if (wdraw>0 && wdraw<=bal){
        bal = bal - wdraw;
        System.out.println("You have withdrawn: ₱" + wdraw);
        System.out.println("Your new balance is: ₱" + bal);
    } else if (wdraw>bal){
        System.out.println("Insufficient balance");
    } else {
        System.out.println("Invalid amount");
    } break;
    case 2:
    System.out.println("Enter amount to deposit: ₱");
    double dep = inp.nextDouble();
    if (dep>0){
        bal = bal + dep;
        System.out.println("You have deposited: ₱" + dep);
        System.out.println("Your new balance is: ₱" + bal);
    } else {
        System.out.println("Invalid amount");
    } break;
    case 3:
    System.out.println("Your current balance is: ₱" + bal);
    break;
    case 4:
    System.out.println("Thank you for using the ATM. Goodbye!");
    break;
    default:
    System.out.println("Invalid choice");
    inp.close();
}
}
}