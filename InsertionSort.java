public class InsertionSort {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int [] arr=new int[]{45,23,34,65,12,15};
        System.out.println("Before sort:");
        printArray(arr);
        System.out.print("\n");
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;  // predecessor   
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;

            } 
            arr[j+1]=current;
            
            printArray(arr);
        }
        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }
}
