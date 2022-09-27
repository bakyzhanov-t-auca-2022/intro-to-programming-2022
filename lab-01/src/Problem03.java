import java.util.Scanner;


public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner t = new Scanner(System.in);
        String x = t.nextLine();
        System.out.println("Hello, " + x + "!");
        System.out.println("Your name in upper-case: " + x.toUpperCase());
        System.out.println("Your name in lower-case: " + x.toLowerCase());
        System.out.println("The total number of characters is " + x.length());
    }
}
