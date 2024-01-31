import java.util.*;
public class Day8_16_Hcf {
    public static void Gcd(int a,int b){
        int m=a;
        int n=b;
        while(m!=n){
            if(m>n)
            m=m-n;
            else
            n=n-m;
           
        }
        System.out.println("hcf of "+a+" and "+b+" is "+m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Gcd(a,b);

        
    }
    
}
