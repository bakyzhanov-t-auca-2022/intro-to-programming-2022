import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        System.out.print("Enter a degree in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        double f = c * 9 / 5 +32;
        System.out.println(c+" Celsius is "+f+" Fahrenheit");

    }
}
