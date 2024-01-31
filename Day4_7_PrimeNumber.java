import java.util.*;
public class Day4_7_PrimeNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int m=n/2;
        int flag=0;
        if(n==0||n==1){
            System.out.println("number is not prime");
        }
        for(int i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+" number is not prime");
                flag=1;
                break;
            }
            
        }
        if(flag==0){
           System.out.println(n+" number is  prime");     
        }
    }
    
}
