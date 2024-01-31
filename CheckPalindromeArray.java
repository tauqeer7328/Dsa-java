public class CheckPalindromeArray{
    public static boolean Check(int arr[]){
        int n=arr.length;
         int start=0;
         int last=n-1;
        while(start<last){
            if (arr[start] != arr[last]) {
                return false;
            }
            start++;
            last--;
        }
      return true;
    }
    public static void main(String args[]){
        int arr[]={1,3,2,2,3,1};
        System.out.println(Check(arr));
       
    }
    
}