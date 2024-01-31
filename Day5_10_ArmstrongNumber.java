import java.util.*;
public class Day5_10_ArmstrongNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        int temp=number;
        int count=0,sum=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp=number;
        while(temp>0){
            int reminder=temp%10;
            sum=(int) (sum+Math.pow(reminder,count));
            temp/=10;
        }
        if(number==sum){
            System.out.println(number+" is armstrong number");
        }
        else
        System.out.println(number+" is not armstrong number");
    }
    
}
