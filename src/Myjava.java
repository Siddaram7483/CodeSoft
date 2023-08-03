import java.util.Scanner;

public class Myjava {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i == 1) {
                System.out.println("siddaram");
            } else
                System.out.println("ntg");
        }
    }
}
