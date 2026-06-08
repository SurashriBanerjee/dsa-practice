import java.util.*;

class  QuickSort {
    int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            //find elements greater than pivot from left
            while(arr[i]<=pivot && i<=high-1)
                i++;
            
            //find elements smaller than pivot from the right 
            while(arr[j]>pivot && j>=low+1)
                j--;

            //swap i and j if i<j
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //place pivot to correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; //return pivot point;
    }

    void sorting(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            sorting(arr, low, pIndex-1);
            sorting(arr, pIndex+1, high);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QuickSort obj = new QuickSort();

        System.out.println("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter elements of the array :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        obj.sorting(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}