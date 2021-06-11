import java.io.*;
import java.util.*;
//display using recursion
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        displayArr(a,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}*/
//display in reverse
/*
public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        displayArrReverse(a,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==arr.length){
            return;
        }
       displayArrReverse(arr,idx+1);
       System.out.println(arr[idx]);
    }
*/
//find max no in array using rec
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int res=maxOfArray(a,0);
        System.out.print(res);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }
        int res=maxOfArray(arr,idx+1);
        if(res>arr[idx]){
            return res;
        }else{
            return arr[idx];
        }
        
    }

} */
//find element idx
/*
public class Main {

    public static void main(String[] args) throws Exception {
   Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=scn.nextInt();
    }
    int x=scn.nextInt();
    int idx=firstIndex(a,0,x);
    System.out.print(idx);
        
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        return firstIndex(arr,idx+1,x);
        
    }

}*/ 
//last index
/*
public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=scn.nextInt();
    }
    int x=scn.nextInt();
    int idx=lastIndex(a,0,x);
    System.out.print(idx);
        
    
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int res= lastIndex(arr,idx+1,x);
        if(res==-1){
             if(arr[idx]==x){
            return idx;
            }else{
            return -1;}
         }
         return res;
        
    }

} */
//all indices of array
/*public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        
       if(idx==arr.length){
          int res[]=new int[fsf];
           return res;
       }
       if(arr[idx]==x){
          int res[]=allIndices(arr,x,idx+1,fsf+1);
          res[fsf]=idx;
          return res;
       }else{
           return allIndices(arr,x,idx+1,fsf);
       }
      
    }

}*/