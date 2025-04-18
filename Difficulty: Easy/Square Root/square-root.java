//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
   public static int floorSqrt(int n) {
       int start=1,end=n;
      while(start<=end){
          int mid=(start+end)/2;
          int val=(mid*mid);
          if(val<=n){
              start=mid+1;
          }
          else{
              end=mid-1;
          }
          
      }
      return end;
   }
   
}
