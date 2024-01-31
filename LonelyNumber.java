import java.util.*;
public class LonelyNumber{
    static void Check(ArrayList<Integer>list){
        Collections.sort(list);
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1) + 1<list.get(i) && list.get(i)+1>list.get(i+1)){
                list1.add(list.get(i));
            }
        }
        if(list.size()==1){
            list1.add(list.get(0));
        }
        if(list.size()>1){
            if (list.get(0) + 1 < list.get(1)) {
                list1.add(list.get(0));
            }
            if (list.get(list.size()-2) + 1 < list.get(list.size()-1)) {
                list1.add(list.get(list.size()-1));
            }
        }
        System.out.println(list1);
        }
    public static void main(String args[]){
       ArrayList<Integer> list=new ArrayList<>();
       int max=Integer.MIN_VALUE;
       list.add(10);
       list.add(6);
       list.add(5);
       list.add(8);
       Check(list);
}
}