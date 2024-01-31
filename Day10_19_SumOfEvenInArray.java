import java.util.Scanner;
public class Day10_19_SumOfEvenInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int sum=0;
        int a[]=new int [n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           sum+=a[i];
        }
       System.out.println("sum of even element is "+sum);
    }
    
}
