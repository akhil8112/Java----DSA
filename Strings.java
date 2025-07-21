
import java.util.*;
public class Strings {
    public static void shortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            //North
            if(a=='N'){
                x++;
            }
            //East
            else if(a=='E'){
                y++;
            }
            //South
            else if(a=='S'){
                x--;
            }
            //West
             else if(a=='W'){
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        System.out.println((float)Math.sqrt(x2+y2));
    }
    public static void largeststring(String fruits[]){
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));

            }
        }
        System.out.println(sb);
    } 
    public static void stringcompress(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }
        System.out.println(newstr);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String fruits[]={"apple","banana","mango"};
        
        
        //shortestPath(str);
        //largeststring(fruits);
        //touppercase(str);
        //stringcompress(str);
         
    }
}
