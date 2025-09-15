import java.util.Scanner;
public class Modulo_Calc {
public static void main(String[] args) {
    System.out.println("Welcome to the Modulo Calculator");
    System.out.print("Enter First Number/Dividend: ");
    Scanner inp = new Scanner (System.in);
    int num1 = inp.nextInt();
    System.out.print("Enter Second Number/Divisor: ");
    int num2 = inp.nextInt();
    if (num2 == 0){
        System.out.println("Invalid Division");
        inp.close();
        return;
    } else {
        int mod = num1 %  num2;
        System.out.println("The answer is: " + mod);
    } inp.close();
}
}
