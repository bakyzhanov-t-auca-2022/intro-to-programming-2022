import java.util.Scanner;


public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner t = new Scanner(System.in);
        String x = t.nextLine();
        System.out.println("Hello, " + x + "!");
    }
}
