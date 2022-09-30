import java.util.Scanner;

public class Main {
    //video 26,27

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a random somethings: ");
        String message = scan.next();
        String newMessage = message.substring(0, 5);
        System.out.println("The new message is: " + newMessage); //boşlukları görmüyor
        int number1 = total2(1, 3, 6, 2, 5);
        System.out.println("The number 1 is : " + number1);
        int number2 = total(1, 4, 7);
        System.out.println("this is number 2 : " + number2);
        String city = giveCity();
        System.out.println(city);

    }

    public static void add() {
        System.out.println("It added");
    }

    public static void delete() {
        System.out.println("It deleted");
    }

    public static void update() {
        System.out.println("It updated");
    }

    public static int total2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }


    public static int total(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static String giveCity() {
        return "Ankara";
    }

}
