import java.util.*;
public class StringPalindrome {
    public static boolean palindrome(String str){
        String newstr="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            newstr+=str.charAt(i);
        }
        if(newstr==str){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        System.out.println(palindrome(str));
    }
    
}
