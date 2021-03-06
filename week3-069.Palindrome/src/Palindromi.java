import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {

        int length = text.length();

        for(int i = 0; i < length/2; i++){
            if( text.charAt(i) != text.charAt(length - 1 - i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
