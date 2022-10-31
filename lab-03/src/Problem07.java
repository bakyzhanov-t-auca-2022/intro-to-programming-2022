import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = scanner.nextInt();
        elapsed = (elapsed + day) % 7;
        String future = "";
        switch (elapsed) {
                case 0:
                    future = "Sunday";
                    break;
                case 1:
                    future = "Monday";
                    break;
                case 2:
                    future = "Tuesday";
                    break;
                case 3:
                    future = "Wednesday";
                    break;
                case 4:
                    future = "Thursday";
                    break;
                case 5:
                    future = "Friday";
                    break;
                case 6:
                    future = "Saturday";
                    break;
            }
        switch (day) {
            case 0:
                System.out.printf("Today is Sunday and the future day is %s", future);
                break;
            case 1:
                System.out.printf("Today is Monday and the future day is %s", future);
                break;
            case 2:
                System.out.printf("Today is Tuesday and the future day is %s", future);
                break;
            case 3:
                System.out.printf("Today is Wednesday and the future day is %s", future);
                break;
            case 4:
                System.out.printf("Today is Thursday and the future day is %s", future);
                break;
            case 5:
                System.out.printf("Today is Friday and the future day is %s", future);
                break;
            case 6:
                System.out.printf("Today is Saturday and the future day is %s", future);
                break;
        }

        }
    }