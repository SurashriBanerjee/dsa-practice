import java.util.*;

class BinarySearch{
    int search(int[] arr, int target){
        int n = arr.length;
        int low=0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target)
                return mid;
            else if(target > arr[mid])
                low = mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinarySeBarch obj = new BinarySeBarch();

        System.out.println("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter elements of the array :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Enter element to search : ");
        int target = Integer.parseInt(sc.nextLine());

        int position = obj.search(arr, target);

        System.out.print(position+1);
    }
}