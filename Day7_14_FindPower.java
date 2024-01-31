import java.util.*;
        public class Day7_14_FindPower{
            public static double FindPower(double x, double n){
                double power=(Math.pow(x,n));
                return power;
        
            }
            public static void main(String args[]){
                System.out.println("enter the numbers");
                Scanner sc=new Scanner(System.in);
                double x=sc.nextDouble();
                double n=sc.nextDouble();
                double power=FindPower(x, n);
                System.out.println(power);
            } 
        }
    