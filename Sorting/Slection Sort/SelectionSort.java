class SelectionSort {
	public static void selection(int arr[], int n) {
		// Write your code here.
		for(int i=0;i<n-1;i++){
			int mini=i;
			for(int j=i;j<n;j++){
				if(arr[j]<arr[mini]){
					mini=j;
				}
			}
			int temp=arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
		}
		 System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={8,3,6,9,7,6,4,1,2};
		int n=arr.length;
		selection(arr, n);
	}
}