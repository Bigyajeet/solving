//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class GFG {
   
        public int lowerbound(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2; 
            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public int UpperBound(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = n; 
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
     ArrayList<Integer> find(int arr[], int x) {
        int n = arr.length;
        int lb = lowerbound(arr, x);

        if (lb == -1 || lb == n || arr[lb] != x) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            result.add(-1);
            return result;
        }

        int ub = UpperBound(arr, x);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(lb);
        result.add(ub - 1);
        return result;
    }
}
  


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            int x = Integer.parseInt(br.readLine());
            GFG ob = new GFG();
            ArrayList<Integer> ans = ob.find(arr, x);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends