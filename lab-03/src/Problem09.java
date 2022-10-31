import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner scanner = new Scanner(System.in);
        int hand = scanner.nextInt();
        int comp = (int) (Math.random() * 1000) % 3;
        String hand1 = "";
        String comp1 = "";
        String battle = "";
        switch (hand) {
            case 0:
                hand1 = "scissor";
                break;
            case 1:
                hand1 = "rock";
                break;
            case 2:
                hand1 = "paper";
                break;
        }
        switch (comp) {
            case 0:
                comp1 = "scissor";
                if (hand == 0) battle = "It is a draw";
                if (hand == 1) battle = "You won";
                if (hand == 2) battle = "You lose";
                break;
            case 1:
                comp1 = "rock";
                if (hand == 1) battle = "It is a draw";
                if (hand == 2) battle = "You won";
                if (hand == 0) battle = "You lose";
                break;
            case 2:
                comp1 = "paper";
                if (hand == 2) battle = "It is a draw";
                if (hand == 0) battle = "You won";
                if (hand == 1) battle = "You lose";
                break;
        }
        System.out.printf("The computer is %s. You are %s. %s", comp1, hand1, battle);


    }
}
