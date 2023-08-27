import java.util.Scanner;

public class CharacterClassification
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {

            System.out.println(ch + " is a Digit.");
        }
        else
        {
            System.out.println(ch + " is a Special Character.");
        }

        scanner.close();
    }
}
