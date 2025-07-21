import java.util.*;
public class Pattern2 {
    
    public static void hollowRectangle(int rows , int cols){
        for(int i=1;i<=rows;i++){
            for (int j=1;j<=cols;j++){
                if (i==1 || i==rows || j==1 || j==cols ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    
    public static void inverted_Rotated_halfpyramid(int rows){
        for (int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void inverted_halfpyramid_withNumber(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void flyodtrinagle(int b){
        int counter=1;
        for (int i=1;i<=b;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle_0_1(int a){
        
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                   
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();

        //hollowRectangle(a,b);
        inverted_Rotated_halfpyramid(a);
        //inverted_halfpyramid_withNumber(a);
        //flyodtrinagle(a);
        //triangle_0_1(a);


    }
    
}
