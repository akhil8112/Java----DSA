import java.util.*;
public class Array2D {

    public static void spiralmatrix(int arr[][]){
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top

            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            
            //right

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom

            for(int j=endcol-1;j>=startcol;j--){
                if (startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            //left

            for(int i=endrow-1;i>=startrow+1;i--){
                if (startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }

    public static void sumofdiagonal(int arr[][]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            //primary diognal
            sum += arr[i][i];

            //secondary diagona;

            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
        }
        System.out.println("Sum of diagonal Matrix: "+sum);
    }

    public static void searching(int arr[][]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        int row=0,col=arr.length-1;

        while(row<arr.length && col>=0){
            if (arr[row][col]==key){
            System.out.println("key found at ("+row+","+col+")");
            break;
            }

            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        
        //spiralmatrix(arr);
        //sumofdiagonal(arr);
        //searching(arr);
    }
}
