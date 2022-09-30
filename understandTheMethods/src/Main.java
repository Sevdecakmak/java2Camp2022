import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//video 25
    //methods
        findNumber();

    }
    public static void findNumber(){
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[] {1,2,5,7,9,0};
        System.out.println("Is there that number? : ");
        int find = scan.nextInt();


        boolean ısThere = false;
        for(int number : numbers){
            if(find==number){
                ısThere = true;
                break;
            }
        }
        if(ısThere)
        {
            System.out.println(" there is a number! ");
        }else{
            System.out.println(" there is no number! ");
        }
    }
}
