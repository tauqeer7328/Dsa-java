import java.util.*;
public class Day8_15_BubbleSort {
    public static void PrintArray(int arr[]){
        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter unsorted array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
             for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
             }
        }
        PrintArray(arr);
    }
}
    
