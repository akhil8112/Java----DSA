// You are using Java
import java.util.*;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Arraylist{

    public static void swap(ArrayList<Integer>list,int i1,int i2){
        int temp = list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,temp);
    }
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }

        }
        return false;
    }

    public static int storeWater(ArrayList<Integer> height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater,currwater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
    public static boolean pairSum2(ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=1;
                break;
            }
        }
       int lp=bp+1;
       int rp=bp;



        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }

        }
        return false;
    }
    

    public static void main(String args[]){
        // ArrayList<Integer> list = new ArrayList<>();
        
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);

        // ArrayList<Integer> height = new ArrayList<>();
        
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        
        // int element = list.get(1);
        // System.out.println(element);
        // list.remove(1);
        // list.set(1,10);
        // System.out.println(list.contains(10));
        // list.add(2,20);
        // swap(list,1,3);
        // Collections.sort(list);  //ascending order
        // Collections.sort(list,Collections.reverseOrder());  //decending order

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);list1.add(2);
        list2.add(3);list2.add(4);
        mainlist.add(list1);
        mainlist.add(list2);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist= mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");

            }
            System.out.println();
        }

        // System.out.println(storeWater(height));
        // System.out.println(pairSum1(list, 5));
        //  System.out.println(pairSum2(height,16));

        
        
    }
}
