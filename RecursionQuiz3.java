public class RecursionQuiz3 {   
static int LIMIT = 1000;
static void fun2(int n)
{
    if (n <= 0) return;
    if (n > LIMIT) return;
 
    System.out.print(String.format("%d ", n));
    fun2(2 * n);
    System.out.print(String.format("%d ", n));
}
public static void main(String[] args) {
    int n=100;
    fun2(n);
}
    
}
