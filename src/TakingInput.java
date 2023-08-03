
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("taking input from the users name called siddaram kusur");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1:");
        int a = sc.nextInt();
        System.out.println("enter the number 2:");
        int b= sc.nextInt();
        int sum =a+b;
        System.out.print("the sum of the three number is:");
        System.out.println(sum);
    }
}
