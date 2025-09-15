import java.util.Scanner;

public class Third {
public static void main(String[] args) {
Scanner inp = new Scanner (System.in);
System.out.print("How many cubic meters of water have you used:");
double cmw= inp.nextDouble();
System.out.println("Choose a consumer type:");
System.out.println("{1}Residential");
System.out.println("{2}Commercial");
System.out.println("{3}Government");
int choice = inp.nextInt();
double cmt = 0;
if (cmw>1 && cmw<31) {
     cmt = cmw*7;
} else if (cmw>30 && cmw<61) {
     cmt = cmw*10;
} else if (cmw>60){
     cmt = cmw*15;
} else if (cmw<0){
    System.out.println("Invalid number");
} else {
    System.out.println("Invalid Input");
}
switch (choice) {
    case 1: 
    double res_tot = cmt * 0.9;
    System.out.println("Your total is: " + res_tot + " (10% discount applied)");
    break;
    case 2: 
    double com_tot = cmt * 0.95;
    System.out.println("Your total is: " + com_tot + " (5% discount applied)");
    break;
    case 3:
    double gov_tot = cmt * 0.85;
    System.out.println("Your total is: " + gov_tot + " (15% discount applied)");
    break;
    default:
    System.out.println("Invalid choice");
    inp.close();
} 
}
}