public class Recurrsion {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=n*fact(n-1);
        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int fn=n+sum(n-1);
        return fn;
    }
    public static int fib(int nth){
        if(nth==0 || nth==1){
            return nth;
        }
        int f=fib(nth-1)+fib(nth-2);
        return f;
    }
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
        return isSorted(arr,i+1);
    }
    public static int firstOccurense(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
            }
        if(arr[i]==key){
            return i;
        }
       
        return firstOccurense(arr,key,i+1);
    }
    public static int lastOccurense(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
            }
        int isfound=lastOccurense(arr,key,i+1);
        if(arr[i]==key && isfound==-1){
            return i;
        }
       
        return isfound;
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
       
        return x*power(x,n-1);
    }
    public static int optimizedpower(int x, int n){
        if(n==0){
            return 1;
        }
       int halfpower=optimizedpower(x, n/2);
       int halfpowersq=halfpower*halfpower;
       if(n%2!=0){
        halfpowersq=x*halfpowersq;
       }
        return halfpowersq;
    }
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    
public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()) {
        System.out.println(newStr);
        return;
        }
//kaam
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
//duplicate
        removeDuplicates (str, idx+1, newStr, map);
        } else {
        map[currChar-'a'] = true;
        removeDuplicates (str, idx+1, newStr.append(currChar), map);
        }
}
public static int friendsPairing(int n){
    if(n==2 || n==1){
        return n;
    }
    int fnm1=friendsPairing(n-1);
    int fnm2=friendsPairing(n-2);
    int pairways=(n-1) *fnm2;


    int totalWays=fnm1+pairways;
    return totalWays;
}

public static void printBinStrings(int n,int lastplace , String str){
    if(n==0){
        System.out.println(str);
        return;
    }
    printBinStrings(n-1, 0, str+"0");
    if(lastplace==0){
        printBinStrings(n-1, 1, str+"1");
    }
}
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,7,8,5};
        String str="aapnnacollegee";
        // System.out.println(fact(5));
        // System.out.println(sum(5));
        // System.out.println(fib(6));
        // System.out.println(isSorted(arr,0));
        // System.out.println(firstOccurense(arr,5,0));
        // System.out.println(lastOccurense(arr,5,0));
        // System.out.println(power(2,10));
        //System.out.println(optimizedpower(2,10));
        //System.out.println(tilingProblem(4));
        //removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
        //System.out.println(friendsPairing(3));
        //printBinStrings(3,0,"");
    }
}
