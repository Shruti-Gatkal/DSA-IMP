public class QuickSort {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
    public static int partition(int arr[],int low,int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int arr[],int low, int high) {
        if(low<high){
            int pivot_index=partition(arr,low,high);
            quicksort(arr, low, pivot_index-1);
            quicksort(arr, pivot_index+1, high);
        }
    }
    public static void main(String[] args) {
        int [] arr=new int[]{45,23,34,65,12,15};
        System.out.println("Before sort:");
        printArray(arr);
        quicksort(arr, 0, arr.length-1);
        System.out.println("\nAfter Sorting:");
        printArray(arr);
}
}
