import java.util.Scanner;


public class LastCharacter {

    public static char lastCharacter(String name){
        return name.charAt(name.length()-1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        System.out.println("Last character: " + lastCharacter(name));
    }
}
