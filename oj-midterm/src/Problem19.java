
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String w = scanner.next();
        int num2 = scanner.nextInt();

        if(w.equals("Infront")) System.out.println(num1 - num2);
        if(w.equals("Behind")) System.out.println(num1 + num2);
    }
}
