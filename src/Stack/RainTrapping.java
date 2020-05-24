package Stack;
import java.util.*;
import java.lang.*;
import java.io.*;

class RainTrapping {
    public static int rains(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int ans = 0;
        int lmax = 0;
        int rmax = 0;
        while (l <= r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] > lmax)
                    lmax = arr[l];
                else ans = ans + Math.abs(lmax - arr[l]);
                l++;
            } else if(arr[r] < arr[l]) {
                if (arr[r] >= rmax)
                    rmax = arr[r];
                else ans = ans + Math.abs(rmax - arr[r]);
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner st = new Scanner(System.in);
        int test = st.nextInt();
        while (test-- > 0) {
            int n = st.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = st.nextInt();
            System.out.println(rains(arr));
        }
    }
}
