public class BubbleSort {
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
        for(int i=0;i<arr.length-1;i++){                //this loop is for pass counter
                                  
            for(int j=0;j<arr.length-i-1;j++){          // this loop is for actual element comparision
                 if(arr[j]>arr[j+1]){     // for desending order just replace > with <
                    int temp=arr[j];   // swapping
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                 }
                
            }
            printArray(arr);
 
        }
        System.out.println("\nAfter sort:");
        printArray(arr);

    }
}
