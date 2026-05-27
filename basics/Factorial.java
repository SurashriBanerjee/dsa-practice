import java.util.Scanner;

public class Factorial{
    int num;
    int calculate(int n) {
        num=n;
        if(num==0)
            return 1;
        else
            return n*calculate(n-1);
    }

public static void main() {
    Scanner sc = new Scanner(System.in);
    Factorial obj = new Factorial();

    System.out.println("Enter a number :");
    int n = Integer.parseInt(sc.nextLine());

    int result = obj.calculate(n);

    System.out.println("Factorial of " + n + " is " + result);
}
}