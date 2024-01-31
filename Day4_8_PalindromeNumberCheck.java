import java.util.*;
public class Day4_8_PalindromeNumberCheck {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=sc.nextInt();
        int temp=number;
        int sum=0;
        while(number>0){
            int reminder=number%10;
            sum=(sum*10)+reminder;
            number/=10;
        }
        if(temp==sum){
            System.out.println("number is palindrome");
        }
        else
        System.out.println("number is not palindrome");
    }
    
}
