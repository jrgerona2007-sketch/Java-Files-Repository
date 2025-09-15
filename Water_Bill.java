import java.util.Scanner;
public class Water_Bill {
public static void main(String[] args) {
//water bill = 150 for every 1 water usage 
//discount family 5% Employee 10% Senior 15%
Scanner inp = new Scanner(System.in);
System.out.println("Welcome to the Water Bill Calcualator");
System.out.print("How much cbm of water have you used?:");
double cbm = inp.nextDouble();
System.out.println("Choose a consumer type");
System.out.println("[1]Family");
System.out.println("[2]Employeee");
System.out.println("[3]Senior");
int choice = inp.nextInt();
double cost = cbm *150;
double cbt = 0;
if (cbm<1){
    System.out.println("Invalid Number");
    inp.close();
    return;
} else {
    switch (choice){
        case 1:
        cbt = cost * 0.95;
        break;
        case 2:
        cbt = cost * 0.90;
        break;
        case 3: 
        cbt = cost * 0.85;
        break;
        default:
        System.out.println("Invalid choice");
    } 
    System.out.println("You have used: "+cost+ " cubic meters of water");
    System.out.println("Your Total Bill is: " + cbt + " Pesos");
    inp.close();
}
}
}
