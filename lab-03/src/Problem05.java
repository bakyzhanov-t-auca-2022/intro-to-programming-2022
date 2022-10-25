import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();
        if (100 >= points && points >= 90) System.out.println("Grade: A");
        if (90 > points && points >= 80) System.out.println("Grade: B");
        if (80 > points && points >= 70) System.out.println("Grade: C");
        if (70 > points && points >= 60) System.out.println("Grade: D");
        if (60 > points) System.out.println("Grade: F");
    }
}
