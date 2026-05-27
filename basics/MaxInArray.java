import java.util.*;

public class MaxInArray{
    int arr[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MaxInArray obj = new MaxInArray();

        System.out.println("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter elements of the array :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        
        int max = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > max)
                max=arr[i];
        }

        System.out.println("Maximum in the array is " + max);
    }
}