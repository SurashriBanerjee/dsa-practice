import java.util.*;

class InsertionSort{
    void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && (arr[j-1] > arr[j])){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        InsertionSort obj = new InsertionSort();

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