package Misc;

public class gasStation {
    public static void g(int[] distance,int[] petrol) {
        int balance = 0;
        int f = 0,r=0;
        t arr[] = new t[4];
        for(int i = 0;i<distance.length;i++){
            arr[i] = new t(distance[i],petrol[i]);
        }
        for (int i = 0;i<arr.length;i++) {
        }
    }
    public static void main(String[] args) {
        int[] distance = {6,5,3,5};
        int[] petrol = {4,6,7,4};
        g(distance,petrol);
    }
}
class t {
    int x;int y;
    public t(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
