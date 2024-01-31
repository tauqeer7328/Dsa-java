import java.util.*;
public class SimpleCalculator{
    public static void main(String args[])
    {
        int choice,a,b;
        System.out.println("enter the two number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter the choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a%b);
            break;
            default:System.out.println("choose properly");
        }

        
    }
    
}
