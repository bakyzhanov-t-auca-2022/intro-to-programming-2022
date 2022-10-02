import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int a = scanner.nextInt();

        int b = a/1000;                 //1-digit
        int c = (a%1000 - a%100) /100;  //2-digit
        int d = (a%100 - a%10)/10;      //3-digit
        int e =a%10;                    //4-digit

        int sum = b+c+d+e;

        System.out.println("The sum of all digits is "+sum);

    }
}
