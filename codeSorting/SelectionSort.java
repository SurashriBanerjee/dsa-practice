import java.util.*;

class SelectionSort{
    void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<=(n-2); i++){
            int min=i;
            for(int j=i; j<=(n-1); j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp =  arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SelectionSort obj = new SelectionSort();

        System.out.println("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter elements of the array :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        obj.sort(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}