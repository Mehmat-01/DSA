import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class OptimalSolution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        
        long s1=0;
        long s2=0;
        long s1n=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            s1+=arr.get(i);
            s2+=(long)arr.get(i)*(long)arr.get(i);

        }
        long val1=s1-s1n;
        long val2=s2-s2n;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        int[] ans={(int)y,(int)x};
        return ans;
        
    }
}
