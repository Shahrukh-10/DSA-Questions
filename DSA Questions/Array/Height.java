import java.lang.reflect.Array;
import java.util.Arrays;

public class Height {

    public void height(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int min,max;
        for (int i = 1; i < n-1; i++) {
            if (arr[i]<k) {
                continue;
            }
            max= Math.max(arr[i-1]+k, arr[n-1]-k);
            min = Math.max(arr[0]+k, arr[i]-k);
            ans = Math.min(ans, max-min);
        }
        System.out.println(ans);
    }
public static void main(String[] args) {
    Height obj = new Height();
    int[] arr ={1,5,8,10};
    int k =2;
    obj.height(arr, k);
}
}
