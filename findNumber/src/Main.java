import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //video 24
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};


        System.out.println("bulunacak sayı: ");
        int finds = scanner.nextInt();


        boolean ısThere = false; // there is no numbers
        for (int number : numbers) {
            if (number == finds) {
                ısThere = true;
                break;
            }
        }
        if (ısThere == true) {
            System.out.println("there is a number");
        } else {
            System.out.println("there is no number");
        }
    }
}
