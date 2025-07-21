import java.util.*;
public class BitManipulation {
    public static void getithbit(int num,int i){
        int bitmask=(1<<i);
        if((num &bitmask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");

        }
    }
    public static int setithbit(int num,int i){
        int bitmask=1<<i;
        System.out.println(num|bitmask);
        return 0; 
    }
    public static int clearithbit(int num,int i){
        int bitmask=~(1<<i);
        System.out.println(num&bitmask);
        return 0; 
    }
    public static int updateithbit(int num,int i,int newbit){
        
        if(newbit==0){
            int out=clearithbit(num, i);
            System.out.println(out);
        }
        else{
            System.out.println(setithbit(num, i));

        }
        return 0; 
    }
    public static void clearlastibits(int num,int i){
        int bitmask = (~0)<<i;
        System.out.println(num & bitmask);
    }
    public static void clearbitsinrange(int num,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(num&bitmask);
    }
    public static void checkpowerof2(int num){
        int x=(num &(num-1));
        if(x==0){
            System.out.println("power of 2.");
        }
        else{
            System.out.println("not a power of 2");
        }
    }
    public static void countsetbit(int num){
        int count=0;
        while(num>0){
            if((num&1) != 0){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }
    public static void fastexpo(int n,int power){
        int ans=1;
        while(power>0){
            if((power&1)!=0){
                ans = ans *n;
            }
            n=n*n;
            power=power>>1;

        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        //getithbit(10,3);
        //setithbit(10,2);
        //clearithbit(10,1);
        //updateithbit(10,2,1);
        //clearlastibits(15,2);
        //clearbitsinrange(10,2,4);
        //checkpowerof2(9);
        //countsetbit(10);
        //fastexpo(5,3);
    } 
}
