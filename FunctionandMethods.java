import java.util.*;
public class FunctionandMethods {

    public static void bionomialcoefficient(int n,int r){
        int factofn=1;
        int factofr=1;
        int factofnr=1;
        for(int i=1;i<=n;i++){
            factofn = factofn * i;
        }
        for(int i=1;i<=r;i++){
            factofr = factofr * i;
        }
        for(int i=1;i<=n-r;i++){
            factofnr = factofnr * i;
        }
        System.out.println((factofn/(factofr*factofnr)));
    }

    public static void binarytodec(int bin){
        int decimal=0;
        int i=0;
        while(bin>0){
            int lastdigit=bin%10;
            decimal=decimal+lastdigit*(int)Math.pow(2,i);
            i++;
            bin=bin/10;
        }
        System.out.println(decimal);
    }
    public static void dectobinary(int dec){
        int binary=0;
        int pow=0;
        while(dec>0){
            int rem=dec%2;
            binary=binary+(rem * (int)Math.pow(10,pow));
            dec=dec/2;
            pow++;
        }
        System.out.println(binary);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        System.out.println("enter r: ");
        int r=sc.nextInt();
        //bionomialcoefficient(n,r);
        //binarytodec(n);
        //dectobinary(n);
    }
}
