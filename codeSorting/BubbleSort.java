import java.util.*;

class BubbleSort{
    void sort(int[] arr){
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            int didSwap=0;
            for(int j=0; j<=i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
                break;
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