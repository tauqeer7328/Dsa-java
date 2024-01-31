import java.util.Arrays;
public class nextGreater {
    public static int[] fun(int[] arr){
        int[]result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
              int greater=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    greater=arr[j];
                    break;
                }
            }
            result[i] = greater;
        }
        return result;
        }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int[] grater=fun(arr);
        System.out.println(Arrays.toString(grater));
    }
    
}
