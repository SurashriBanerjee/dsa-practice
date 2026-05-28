import java.util.*;

public class SecondLargest{
    void calculate(int[] arr){
        int largest, slargest;
        largest = arr[0];
        slargest = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest)
                slargest = arr[i];
        }

        System.out.print(slargest);
    }

    public static void main(String[] args){
        SecondLargest obj = new SecondLargest();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Second Largest Element : ");
        obj.calculate(arr);
    }
}