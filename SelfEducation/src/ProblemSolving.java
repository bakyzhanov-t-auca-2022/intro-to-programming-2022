import javax.swing.*;
import java.util.Scanner;
import java.util.Random;







/*
Enter day month and year will show you the day after
public class ProblemSolving {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        if (z%4==0){
            //Feburary
            if (y==2){
                if (x<29&x>0){
                    x=x+1;
                    System.out.println(x + " "+y+" "+z);
                }
                if (x==29){
                    x=x-28;
                    y=3;
                    System.out.println(x+" "+y+" "+z);
                }
            }}

        else if (y==1|y==8|y==3|y==5|y==7|y==10){
                if (x==31){
                    x=x-30;
                    y=y+1;
                    System.out.println(x+" "+y+" "+z);
                }
                if (x>0&x<31){
                    x=x+1;
                    System.out.println(x+" "+y+" "+z);
                }
            }
        else if(y==4|y==6|y==9|y==11){
                if (x==30){
                    x=x-29;
                    y=y+1;
                    System.out.println(x+" "+y+" "+z);
                }
                if (x>0&x<30){
                    x=x+1;
                    System.out.println(x+" "+y+" "+z);
                }

            }
        else if (y==12){
                if (x==31){
                    x=x-30;
                    y=y-11;
                    z=z+1;
                    System.out.println(x+" "+y+" "+z);
                }
                if (x<31){
                    x=x+1;
                    System.out.println(x+" "+y+" "+z);
                }
            }
        if (z%4!=0){
            if (y==2){
                if (x<28&x>0){
                    x=x+1;
                    System.out.println(x + " "+y+" "+z);
                }
                if (x==28){
                    x=x-27;
                    y=3;
                    System.out.println(x+" "+y+" "+z);
                }
            }}

    }

        }

*/










    /*public static void main(String[] args) {
        //switch case default break
        System.out.println("Enter day ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day){
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            case "Monday":
                System.out.println("Its monday");
                break;
            default:
                System.out.println("Pick another day");
        }
*/

// Random shit
//    public static void main(String[] args) {
//        Random random= new Random();
//        int x = random.nextInt();
//        if(x>0){
//            System.out.println("Possitive");
//        }
//        else if (x<0){
//            System.out.println("Neggative");
//        }
//        else {
//            System.out.println("you are lucky");
//        }
//        System.out.println(x);
//    }





/*

//Matrix for 2x2
 public class ProblemSolving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a 1 1 = ");
        double  a11 = scanner.nextDouble();
        System.out.print("a 1 2 = ");
        double a12 = scanner.nextDouble();
        System.out.print("a 2 1 = ");
        double a21 = scanner.nextDouble();
        System.out.print("a 2 2 = ");
        double a22 = scanner.nextDouble();
        double x1;
        double x2;
        System.out.print("b 1 = ");
        double b1 = scanner.nextDouble();
        System.out.print("b 2 = ");
        double b2 = scanner.nextDouble();
        double detA = (a11 * a22) -(a12*a21);
        System.out.print("Determinant of A is "+detA);
        //Cofactoring
        double temp;
        temp = a11 ;
        a11 = a22;
        a22 = temp;
        temp = a12;
        a12= (-1)*a21;
        a21 = (-1)*temp;
        temp= a12;
        a12 = a21;
        a21=temp;
        x1 = ((a11*b1)+(a12*b2))/detA;
        x2 = ((a21*b1)+(a22*b2))/detA;
        System.out.println("\nx 1 = "+x1+"\nx 2 = "+x2);
    }

}
*/

/*
public class ProblemSolving {
    public static void main(String[] args) {
        Random random = new Random();
        double x = random.nextDouble();
        double y = 0.5;
        System.out.println(x);
    }
*/




   /* public static void main(String[] args) {
        //Hypotenuse problem
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is x? ");
        x = scanner.nextDouble();
        System.out.println("What is y? ");
        y = scanner.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Your Hypotenuse is " + z);
    }
*/





    /*public static void main(String[] args) {
        double x=3.14;
        double a = 4;
        double y = -10;
           double z = Math.max(x,y);  // max b/w two nums
           double z1 = Math.min(x,y); // min between two nums
           double z2 = Math.abs(y);   // absolute value
           double z3 = Math.sqrt(a);  // square root
           double z4 = Math.round(x); // round
           double z5 = Math.ceil(x);  // rounds upwards
           double z6 = Math.floor(x); // rounds downside
        System.out.println(z6);
        System.out.println(z5);
        System.out.println(z4);
        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);

    }*/




    /*public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        int y = x*x;
        int z=y*x;
        System.out.println("a   a^2     a^3");
        System.out.print(x+"    ");
        System.out.print(y+"    ");
        System.out.print(z);
    }*/

