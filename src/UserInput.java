import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string name u want to type:");
        String scanner = sc.nextLine();
        System.out.println("the words are:"+scanner);
    }
//        Scanner scanner =new Scanner(System.in);
//        System.out.print("enter the value in which u want to enter:");
//        String sc = scanner.nextLine();
//        System.out.println("your entered: "+sc);
//        scanner.close();
//    }
}
