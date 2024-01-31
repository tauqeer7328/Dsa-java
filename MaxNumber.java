import java.util.*;
public class MaxNumber {
    public static void main(String args[]){
       ArrayList<Integer> list=new ArrayList<>();
       int max=Integer.MIN_VALUE;
       list.add(5);
       list.add(4);
       list.add(6);
       list.add(9);
       list.add(8);
     for(int i=0;i<list.size()-1;i++){
        if(max<list.get(i)){
            max=list.get(i);
        }
     }
     System.out.println(max);
}
}