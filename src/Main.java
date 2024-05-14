import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //int a;
        //int b;

        Scanner enterNumber = new Scanner(System.in);
        int i = 0;

        System.out.print("Enter Your First Number:");
        int a = enterNumber.nextInt();
        System.out.println(" First Number is: "+ a);
        System.out.print("Enter Your Second Number:");
        int b = enterNumber.nextInt();
        System.out.println(" Second Number is:"+ b);

        Sum(a,b);
    }

    public static void Sum(int a, int b){

        int sum = a + b;
        System.out.println("The sum of both numbers is:"+ sum);

    }
}

