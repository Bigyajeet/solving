//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    int maxSubarraySum(int[] arr) {
        
        // Your code here
         if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;
        int smallestNegative = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int num : arr) {
            currentMax += num;

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }

            if (num < 0) {
                if (smallestNegative == Integer.MIN_VALUE || num > smallestNegative) {
                    smallestNegative = num;
                }
            }

            if (currentMax < 0) {
                currentMax = 0;
            }
        }

        // If all numbers are negative, the maximum subarray sum will be the largest negative number.
        // In this specific case, we need the smallest negative number.
        if (maxSoFar < 0) {
            return smallestNegative;
        } else {
            return maxSoFar; // This part of standard Kadane's won't be reached in your specific case
                           // but is included for completeness o
       
}
}
}
