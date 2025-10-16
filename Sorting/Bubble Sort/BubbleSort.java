
public class BubbleSort {
    
    public static void bubbleSort(int[] arr, int n) {   
       for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
   public static void main(String[] args) {
    int[] arr={5,6,9,2,4,6,1};
    int n=arr.length;
    bubbleSort(arr, n);
   }
}
