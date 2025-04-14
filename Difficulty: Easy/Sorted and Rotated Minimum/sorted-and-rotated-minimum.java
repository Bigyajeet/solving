//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob = new Solution(); // Instantiate the Solution object once

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            System.out.println(ob.findMin(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int minimum=Integer.MAX_VALUE;
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[start]<=arr[mid]){
                minimum=Math.min(minimum,arr[start]);
                start=mid+1;
            }else{
                minimum=Math.min(minimum,arr[mid]);
                end=mid-1;

            }
        }
        return minimum;
    }
    }

