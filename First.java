import java.util.Scanner;

public class First {
  public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);
    System.out.print("Month (in numerical): ");
    int bmon = inp.nextInt();
    System.out.print("Day: ");
    int bday = inp.nextInt();
    if (bmon ==1  && bday>=20 && bday<= 31) {
        System.out.println("You're an Aquarius!");
    } else if (bmon ==2 && bday>0 && bday<= 18){
         System.out.println("You're an Aquarius!");
    } else if ((bmon > 12 || bmon<1) || (bday>31 || bday <1)){
        System.out.println("Invalid month or date");
    }
    else {
        System.out.println("You're not an Aquarius!");
        inp.close();
    }
  }
}
    