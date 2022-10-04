import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int y = scanner.nextInt();
        double current = 312032486;
        double second = 365*24*60*60;

        double birth = y * second / 7;
        double death = y * second / 13;
        double imm = y * second /45;
        double done = current + birth - death + imm;
        int bone = (int) Math.round(done);

        System.out.printf("The population in %d years is %d",y,bone);
    }
}
