import java.util.*;

public class RotateArray{
    void reverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        RotateArray obj = new RotateArray();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter number of elements to rotate : ");
        int d = Integer.parseInt(sc.nextLine());
        d=d%n;

        obj.reverse(arr, 0, d-1);
        obj.reverse(arr, d, n-1);
        obj.reverse(arr, 0, n-1);

        System.out.print("Array after Rotation : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}