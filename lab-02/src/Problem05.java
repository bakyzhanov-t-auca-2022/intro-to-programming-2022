import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature in degrees Fahrenheit? ");
        double f = scanner.nextDouble();
        double c  = ((f - 32) *5 )/ 9;
        System.out.printf("The temperature in degrees Celsius is %.2f",c);
    }
}
