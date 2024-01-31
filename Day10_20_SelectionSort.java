import java.util.*;
public class Day10_20_SelectionSort {
    public static void PrintArray(int a[]){
        System.out.println("the sorted array is");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(a[smallest]>a[j])
                smallest=j;
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
          PrintArray(a);
    }
    
}
