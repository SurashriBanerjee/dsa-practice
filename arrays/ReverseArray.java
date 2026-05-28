import java.util.*;

public class ReverseArray{
    void reverse(int[] arr){
        int start, end;
        start = 0;
        end = arr.length - 1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        ReverseArray obj = new ReverseArray();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        obj.reverse(arr);
        System.out.print("Reversed Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}