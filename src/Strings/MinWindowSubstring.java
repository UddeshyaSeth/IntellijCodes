package Strings;

public class MinWindowSubstring {
    public static void windows(String s,String c) {

    }

    public static void main(String[] args) {
        String s="udseshabncsd";
        String c="abc";
        if(s.contentEquals(new StringBuffer(c)))
            System.out.println("t");
        else System.out.println("f");

    }
}
