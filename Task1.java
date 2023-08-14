import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random R=new Random();
        int a=R.nextInt(100);
        //System.out.println(a);

//        System.out.println(" ----caution----  ");
//        System.out.println("you can only use 5 attempt");

        do {
            System.out.println("enter a number to guess the number");
            int x = sc.nextInt();
            //for multiple entry
            if (x == a) {
                System.out.println("your guess is correct");
                break;
            } else if (a > x) {
                System.out.println("your number is small try with bigger number");
            } else
                System.out.println("your number is bigger than actual number try small");

        }
        while (a > 0);
    }
}
