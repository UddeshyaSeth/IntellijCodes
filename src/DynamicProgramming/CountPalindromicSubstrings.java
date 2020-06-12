package DynamicProgramming;

public class CountPalindromicSubstrings {
    public static void helper(String s ) {
        int arr[][] = new int[s.length()+1][s.length()+1];
        String reverse = "";
        for(int i = s.length()-1;i>=0;i--)
            reverse+= s.charAt(i);
        for(int i = 1;i<arr.length;i++) {
            for(int j = 1;j<arr[0].length;j++){
                if(reverse.charAt(i-1) == s.charAt(j-1))
                    arr[i][j] = arr[i-1][j-1] + 1;
                else arr[i][j] = 0;
            }
        }
        int  c = 0;
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr.length;j++) {
                if(arr[i][j] != 0)
                    c++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
       String s = "abababa";
       helper(s);
    }
}
