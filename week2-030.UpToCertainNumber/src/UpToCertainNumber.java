
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int y = Integer.parseInt(reader.nextLine());

        int x = 1;

        while(x <= y){
            System.out.println(x);
            x++;
        }
    }
}
