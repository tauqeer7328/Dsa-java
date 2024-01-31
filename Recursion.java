public class Recursion {
    public static int f(int n){
       if(n==0)
          return 1;
       else
          return (n*f(n-1));
        }
    public static void main(String[] args) {
        int n=5;
        System.out.println(f(n));
    }
}
