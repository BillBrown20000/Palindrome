import java.util.Scanner;
public class PalindromeExample {
    public static void Pal(){
        String Palindrome = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 digit pin");
        String Pin = scanner.nextLine();

        int length = Pin.length();
        int x = 0;
        for ( x = length - 1; x >= 0; x--) {
            Palindrome = Palindrome + Pin.charAt(x);

        } if (Pin.equals(Palindrome)){
            System.out.println("The 5 digit pin is a palindrome.");
            x = 0;
        }
        else {
            System.out.println("Try again");
            Pal();


        }
    }


    public static void main(String[] args){
    Pal();
    }
}