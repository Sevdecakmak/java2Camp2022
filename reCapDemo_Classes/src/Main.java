import java.util.Scanner;

public class Main {
    //video 31
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FourOperation fourOperation = new FourOperation();
        System.out.println("Enter the number1 :");
        int number1 = scan.nextInt();
        System.out.println("Enter the number2 :");
        int number2 = scan.nextInt();
        int result=0;

        result = fourOperation.Total(number1,number2);
        System.out.println("The result of the Sum: " +result);

        result = fourOperation.Minus(number1,number2);
        System.out.println("The result of the Minus: " +result);

        result = fourOperation.Multiply(number1,number2);
        System.out.println("The result of the Sum: " + result);

        result = fourOperation.Divide(number1,number2);
        System.out.println("The result of the Sum: " +result);

    }
}
