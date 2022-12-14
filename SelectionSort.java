public class SelectionSort {
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
        for(int i=0;i<arr.length-1;i++){  // for pass counter
            int smallest=i;   
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[smallest]){
                smallest=j;
               }
            }
            int temp=arr[smallest];   //swapping 
            arr[smallest]=arr[i];
            arr[i]=temp;
            printArray(arr);
        }
        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }
}
