import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        System.out.print("Number of points? ");
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();

        if (points >= 40) System.out.println("You passed “Intro to Programming”!!!\n" +
                "You should take “Object-Oriented Programming” in the next semester");
        else System.out.println("You failed “Intro to Programming”!!!\n" +
                "You can take it again in the fall semester next year.");
    }
}
