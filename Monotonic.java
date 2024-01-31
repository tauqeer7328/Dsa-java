import java.util.*;
public class Monotonic {
    static boolean Check(ArrayList<Integer>list){
        boolean inc= true;
        boolean dec= true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return dec || inc ;
    }
    public static void main(String args[]){
       ArrayList<Integer> list=new ArrayList<>();
       int max=Integer.MIN_VALUE;
       list.add(1);
       list.add(2);
       list.add(2);
       list.add(3);
       list.add(4);
       System.out.print(Check(list));
}
}