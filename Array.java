import java.util.*;
public class Array {
    public static void update(int arr[] ){
        for(int i=0;i<arr.length;i++){
            arr[0]=arr[0]+1;
            System.out.print(arr[0]+" ");
        }
    }

    public static int linearSearch(int arr[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key to find: ");
        int key=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
        
    }

    public static void maxValueinArray(int arr[]){
        int maxValue=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        System.out.println("Largest value is : "+ maxValue);
    }

    public static int binarysearch(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key to find: ");
        int key=sc.nextInt();
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==key){
               System.out.println("Key at index: "+mid);
               break;
            }
            if (arr[mid]<key){
                start=mid + 1;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
    }

    public static void reverse(int arr[]){
        int first=0,last=arr.length-1;

        while (first<last) {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void pairinArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+i+","+j+") ");
            }
        }
    }

    public static void subArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.err.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubArray(int arr[]){
        int sum_Sub_arr=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum_Sub_arr=0;
                for(int k=i;k<=j;k++){
                    sum_Sub_arr=sum_Sub_arr+arr[k];
                }
                System.out.println(sum_Sub_arr);
                if (maxsum<sum_Sub_arr){
                    maxsum=sum_Sub_arr;
                }
            }
            
        }
        System.out.println("max sum of sub Array: "+maxsum);
    }
    public static void maxSubArrayprefix(int arr[]){
        int sum_Sub_arr=0;
        int maxsum=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum_Sub_arr = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
               
                if (maxsum<sum_Sub_arr){
                    maxsum=sum_Sub_arr;
                }
            }
            
        }
        System.out.println("max sum of sub Array: "+maxsum);
    }
    public static void kadaneMaxSubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
         for(int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(currentsum,maxsum);

         }
         System.out.println("Max Sum: "+maxsum);
    }

    public static void buyandsellstock(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            } else{
                buyprice=prices[i];
            }
        }
    System.out.println("Max Profit: "+maxprofit);
    }

    public static void trapping_rainwater(int height[]){
        int n=height.length;

        //calculate left max boundary array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //calculate right max boundary array
        int rightmax[]=new int[n];
       rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater += waterlevel-height[i];
        }

        System.out.println("Water Trapped: "+trappedWater);

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
        //update(arr);
        // int index=linearSearch(arr);
        // if (index==-1){
        //     System.out.print("NOT found");
        // }
        // else{
        //     System.out.print("key found at index: "+ index);
        // }
        //maxValueinArray(arr);
        binarysearch(arr);
        //reverse(arr);
        //pairinArray(arr);
        //subArray(arr);
        //maxSubArray(arr);            //bruteforce
        //maxSubArrayprefix(arr);            //prefix sum
        //kadaneMaxSubarray(arr);
        //buyandsellstock(arr);
        //trapping_rainwater(arr);


    }
    
}

