import java.util.*;
public class SortingAlgorithm {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" " );

        }   
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
    
        }   
    }

    public static void insertionsort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
    
        } 
    }

    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        //frequency of values in original array
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
    
        } 
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionsort(arr);
        //countingsort(arr);
    }
}
