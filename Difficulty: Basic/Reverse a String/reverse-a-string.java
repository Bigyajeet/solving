//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str = read.readLine();
            System.out.println(new Solution().reverseString(str));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        StringBuilder sb=new StringBuilder(s);
         for(int i=0;i<sb.length()/2;i++){
             int front=i;
             int back=sb.length()-1-i;
             
             char frontChar=sb.charAt(front);
             char backChar=sb.charAt(back);
             
             sb.setCharAt(front,backChar);
             sb.setCharAt(back,frontChar);
         }
        //  System.out.println(sb);
        return sb.toString();
    }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     String s=sc.next();
    //   reverseString(s);
        
    // }
}
    