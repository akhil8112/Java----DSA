import java.util.*;
public class practice {
    public static void main(String args[]){
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.remove(1);
        // list.set(1,10);
        // list.add(1,3);
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.print(list.contains(10));
        
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(10);
        ts.add(6);
        ts.add(8);
        ts.remove(6);
        System.out.println(ts);
        System.out.print(ts.higher(8));
    }
}
