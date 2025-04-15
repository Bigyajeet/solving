public class HowMuchArrayRotated {
    public static int findRotation(int arr[]){
        int start=0,end=arr.length-1;
        int mini=Integer.MAX_VALUE;
        int index=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[start]<=arr[end]){
                if(arr[start]<mini){
                    index=start;
                    mini=arr[start];
                }
                break;
            }
            if(arr[start]<=arr[mid]){
                if(arr[start]<mini){
                    index=start;
                    mini=arr[start];
                }
                start=mid+1;
        }else{
            end=mid-1;
            if(arr[mid]<mini){
                index=mid;
                mini=arr[mid];
            }
        }
    }
    return mini;
}
public static void main(String[] args) {
    int arr[]={3, 4, 5, 1, 2};
    System.out.println(findRotation(arr));
}
}