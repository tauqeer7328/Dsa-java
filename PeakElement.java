import java.util.*;
public class PeakElement{
    public static void main(String args[]){
        int arr[]={1,2,1,3,5,6,4};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i-1]<arr[i]){
                System.out.println(i);
            }
        }
    }
}
