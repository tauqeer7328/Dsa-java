import java.util.*;
public class Fibbonacci {
    public static void FindFibbonacci(int n){
        int a=0;
        int b=1;
        int next;
        System.out.print(a+" "+b+" " );
        for(int i=2;i<=n;i++){
            next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
    public static void main(String []args){
       System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FindFibbonacci(n);
    }
    
}
