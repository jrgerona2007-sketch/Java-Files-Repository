import java.util.Scanner;

public class Bus_Fare {
public static void main(String[] args) {
    //Create e Taxi Fare Calculator that calculate a passenger's fare. 
    //Remember that there's a base fare of 40 Pesos for the first kilometer, 
    //and for every 1 kilometer added, there's another 15 Pesos added to the fare. 
    //If the passenger is a senior citizen(60 above) there will be a 20% discount.
    Scanner inp = new Scanner (System.in);
    System.out.println("Welcome to the Taxi Fare Calculator");
    System.out.print("Enter distance traveled (in km): ");
    double dist = inp.nextDouble();
    System.out.print("Are you a senior citizen? [1] Yes [0] No: ");
    int senior = inp.nextInt();
    double fare = 0;
   if (dist>=1){
        fare = 40+ ((dist-1)*15);
    } else {
        System.out.println("Invalid distance");
        inp.close();
        return;
    }
    if (senior == 1){
        fare = fare*.80;
        System.out.println("Your total fare is: " + fare);
    } else if (senior == 0){
        System.out.println("Your total fare is: " + fare);
    } else {
        System.out.println("Invalid fare");
    }inp.close();
}
}