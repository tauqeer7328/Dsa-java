import java.util.*;
public class Day9_18_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int reminder=temp%10;
            sum=(sum*10)+reminder;
            temp/=10;
        }
        System.out.println("reverse of "+n+" is "+sum);
    }
    
}
