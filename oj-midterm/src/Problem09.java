import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double radius = scanner.nextDouble();
        
        double height = scanner.nextDouble();
        
        double V = Math.PI * radius * radius * height / 3;
        
        System.out.printf("%.2f",V);
    }
}
