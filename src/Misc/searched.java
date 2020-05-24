package Misc;

public class searched {
    public static void searching(int[] arr,int target,int ans) {
        int l = 0; int h = arr.length-1;
        while (l <= h) {
            int mid = l + (h-l)/2;
            if(arr[mid] == target) {
                System.out.print(mid);
                return;
            }
            if(arr[l] <= arr[mid]) {
                if(target < arr[mid] && arr[l] <= target)
                    h = mid-1;
                else l = mid +1;
            }
            if(arr[mid] <= arr[h]) {
                if(target <= arr[h] && target > arr[mid])
                    l = mid +1;
                else h = mid -1;
            }
        }
        System.out.print("NF");
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};

        int ans = -1;
        searching(arr,4,ans);
       // System.out.println(ans);
    }
}
