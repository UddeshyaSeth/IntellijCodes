package Strings;

public class MinimumInsertionsinFront {
    public static int lcs(String s,String temp) {
        int dp[][] = new int[s.length()+1][temp.length()+1];

        for(int  i = 1;i<dp.length;i++) {
            for(int j = 1;j<dp[0].length;j++) {
                if(s.charAt(i-1) == temp.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] +1;
                else dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        for(int i = 0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++)
                System.out.print(dp[i][j]+" ");
                System.out.println();
        }
        return dp[s.length()][temp.length()];
    }
    public static void solve(String s) {
        String temp = "";
        for(int i= s.length()-1;i>=0;i--)
            temp+=s.charAt(i);
        //System.out.print(temp);
       int k = lcs(s,temp);
       k = temp.length() - k;
     //  System.out.print(k);
       int j = 0;
       String t= "";
       while(k-->0 && j < temp.length()) {
           t = t+temp.charAt(j++);
       }
       t = t+s;
       System.out.print(t);
    }

    public static void main(String[] args) {
        String  s ="abb";
        solve(s);
    }
}

