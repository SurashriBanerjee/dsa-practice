import java.util.Scanner;

public class Fibonacci{
    void series(int n){
        int a=0, b=1, c;

        for(int i=1; i<=n; i++){
            System.out.print(a + " ");

            c=a+b;
            a=b;
            b=c;
        }
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();

        System.out.print("Enter limit of series : ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Fibonacci Series :");
        obj.series(num);
    }
}