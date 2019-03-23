import java.util.Scanner;

public class Test {

    //java main method
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer number:");
        int a = scanner.nextInt();

        System.out.println("Enter the integet number");
        int b = scanner.nextInt();

        System.out.println("Addition on of " + a + " and " + b + " = " + (a + b));
    }
}
