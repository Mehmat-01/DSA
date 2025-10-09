import java.util.ArrayList ;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        
        long actual_sum=0;
        long actual_sum_of_square=0;
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            actual_sum+=arr.get(i);
            actual_sum_of_square+=(long)arr.get(i)*(long)arr.get(i);

        }
        long val1=actual_sum-sn; //val1=x-y
        long val2=actual_sum_of_square-s2n; //val2=x^2-y^2
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        int[] ans={(int)y,(int)x};
        return ans;
        
    }
}
