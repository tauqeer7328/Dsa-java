import java.util.*;
public class Day6_12_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        int fact=1;
        fact=factorial(number);
        System.out.println("factorial of "+number+" is:"+fact);
    }
    static int factorial(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));   
       }    
    
}
