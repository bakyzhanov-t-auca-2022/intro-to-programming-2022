import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length in inches? ");
        int in = scanner.nextInt();
        double cm = in *2.54;
        System.out.printf("%d in. = %.2f cm.",in,cm);
    }
}
