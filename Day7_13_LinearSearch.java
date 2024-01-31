import java.util.*;
public class Day7_13_LinearSearch {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element in array");
        int n=sc.nextInt();
        int a[]=new int[5];
        int i;
        System.out.println("enter the element of array");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the searching element");
        int k=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==k){
                System.out.println("number found at "+(i+1));
                break;
            }
           // else
           // System.out.println("number is not found");
        }
        if(i>=n){
            System.out.println("element not found");
        }

    }
    
}
