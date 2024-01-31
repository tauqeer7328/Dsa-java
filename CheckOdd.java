import java.util.*;
public class CheckOdd {
    public static boolean Check(int a){
        if(a%2==0){
            return true;
        }
        else
           return false;

    }
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        Check(a);

      }

}
