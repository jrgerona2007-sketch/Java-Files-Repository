import java.util.Scanner;

public class Second {
public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);
    System.out.print("Month (in numerical): ");
    int bmon = inp.nextInt();
    System.out.print("Day: ");
    int bday = inp.nextInt();
    switch (bmon) {
        case 1: 
        if (bday>19 && bday<32){
            System.out.print("You are an Aquarius, born on: January " + bday);
        } else { System.out.print("You are not an Aquarius");
    } break;
        case 2:
        if (bday >0 && bday<19){
            System.out.print("You are an Aquarius, born on: February " + bday);
            } else { System.out.print("You are not an Aquarius");
    } break;
        default:
        System.out.print("You are not an Aquarius");
        inp.close();
    }
}
}
