public class MaxValue {
     public static void main(String[] args) {
        int[] arr={5,6,2,8,1,7,0};
        int n=arr.length;
        int max_value=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max_value){
                max_value=arr[i];
            }
        }
        System.out.println("Maximum Value in Array: "+max_value);
     }
}