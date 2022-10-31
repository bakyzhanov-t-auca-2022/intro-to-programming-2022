import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min = num1;
        if (min > num2) min = num2;
        if (min > num3) min = num3;
        System.out.println(min);
        int max = num1;
        if (max < num2) max = num2;
        if (max < num3) max = num3;
        int middle = num1 + num2 + num3 - min - max;
        System.out.println(middle);
        System.out.println(max);
    }
}
