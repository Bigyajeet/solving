//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            if (ob.isPrime(n)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// class Solution {
//     static boolean isPrime(int n) {
//         // code here
//         Scanner sc=new Scanner(System.in);
// n=sc.nextInt();
// if(n==2){
// System.out.println("n is prime");
// }else{
// boolean isPrime=true;
// for(int i=2;i<=n-1;i++){
// if(n%i==0){
// isPrime=false;
// }
// }
// if(isPrime=true){
// System.out.println("n is prime");
// }else{
// System.out.println("n is not  prime");
// }
// }
// return ;
// }
// }
 class Solution {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) { //even number other than 2
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) { //optimize by checking only odd divisors up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("n is prime");
        } else {
            System.out.println("n is not prime");
        }
        sc.close(); //close scanner
    }
}