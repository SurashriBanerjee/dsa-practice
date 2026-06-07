import java.util.*;

class MergeSort{
    void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        //compose and merge both halves
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        
        //add remaining elements from the left half
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        //add remaining elements from the right half
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        //copy back to original array
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    void mergeSort(int[] arr, int low, int high){
        if(low == high) //base class
            return;
        
        int mid = (low+high)/2;

        mergeSort(arr, low, mid); //sort left haf
        mergeSort(arr, mid+1, high); //sort right half
        merge(arr, low, mid, high); //merge both halves
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MergeSort obj = new MergeSort();

        System.out.println("Enter capacity of array : ");
        int n = Integer.parseInt(sc.nextLine());

        int arr[] = new int[n];

        System.out.println("Enter elements of the array :");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        obj.mergeSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}