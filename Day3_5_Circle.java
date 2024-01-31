import java.util.Scanner;
public class Day3_5_Circle{
    public static void CircumferenceOfRadius(int radius){
        double circumference= (2*3.14*radius);
        double area=(3.14*radius*radius);
        System.out.println(circumference);
        System.out.println(area);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        int radius=sc.nextInt();
        CircumferenceOfRadius(radius);
    }
}