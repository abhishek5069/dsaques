import java.io.*;
import java.util.*;

//BUBBLE SORT
/*
public class Main {

  public static void bubbleSort(int[] arr) {
      int n=arr.length;
    for(int itr=1;itr<n;itr++){
        for(int j=0;j<n-itr;j++){
            if(isSmaller(arr,j+1,j)){
                swap(arr,j+1,j);
            }
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    bubbleSort(arr);
    print(arr);
  }

}
*/

//INSERTION SORT

/*import java.io.*;
import java.util.*;

public class Main {

  public static void insertionSort(int[] arr) {
    int n=arr.length;
    for(int itr=1;itr<n;itr++){
        for(int j=itr;j>0;j--){
            if(isGreater(arr,j-1,j)){
                swap(arr,j-1,j);
            }else{
                break;
            }
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if jth element is greater than ith element
  public static boolean isGreater(int[] arr, int j, int i) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    insertionSort(arr);
    print(arr);
  }

}*/

//MERGE SORT
/*import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeSort(int[] arr, int lo, int hi) {
      if(lo==hi){
          return new int[]{arr[lo]};
      }
    int mid=(lo+hi)/2;
    int[] leftp=mergeSort(arr,lo,mid);
    int[] rightp=mergeSort(arr,mid+1,hi);

    return mergeTwoSortedArrays(leftp,rightp);
  }

  //used for merging two sorted arrays
  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    System.out.println("Merging these two arrays ");
    System.out.print("left array -> ");
    print(a);
    System.out.print("right array -> ");
    print(b);
    int i = 0, j =0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }

    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }

    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    }
    
    return ans;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int[] sa = mergeSort(arr,0,arr.length - 1);
    System.out.print("Sorted Array -> ");
    print(sa);
  }

} */

//MERGE TWO SORTED ARRAY

/*import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int n1=a.length;
    int n2=b.length;
    int arr[]=new int[n1+n2];
    int i=0,j=0,k=0;
    while(i!=n1&&j!=n2){
        if(a[i]<=b[j]){
            arr[k++]=a[i++];
        }
        else if(a[i]>b[j]){
            arr[k++]=b[j++];
        }
    }
    while(i<n1){
        arr[k++]=a[i++];
    }
    while(j<n2){
        arr[k++]=b[j++];
    }
    
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}*/

//PARTITION OF AN ARRAY
/*import java.io.*;
import java.util.*;

public class Main {

  public static void partition(int[] arr, int pivot){
    int i=0,j=0;
    while(i<arr.length){
        if(arr[i]>pivot){
            i++;
        }else{
            swap(arr,i,j);
            i++;
            j++;
        }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}*/
//COUNT SORT

/*import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   int range=max-min+1;
   int freq[]=new int[range];
   for(int val:arr){
       int pos=val-min;
       freq[pos]++;
   }
   for(int i=1;i<range;i++){
       freq[i]+=freq[i-1];
   }
   int res[]=new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
       int val=arr[i];
       int pos=val-min;
       int ele=freq[pos];
       res[ele-1]=val;
       freq[pos]--;
   }
   for(int i=0;i<arr.length;i++){
       arr[i]=res[i];
   }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}*/

//RADIX SORT
/*import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    Scanner scn=new Scanner(System.in);
    int n=arr.length;
    
    int max=Integer.MIN_VALUE;
    for(int val:arr){
        if(val>max){
            max=val;
        }
    }
    int digits=max;
    int count=0;
    while(digits!=0){
        digits=digits/10;
        count++;
    }
    int exp=1;
    while(count!=0){
       countSort(arr,exp);
       exp=exp*10;
       count--;
    }
  }

  public static void countSort(int[] arr, int exp) {
    int freq[]=new int [10];
    for(int i=0;i<arr.length;i++){
        freq[(arr[i]/exp)%10]++;
    }
    for(int i=1;i<10;i++){
        freq[i]+=freq[i-1];
    }
    int res[]=new int[arr.length];
    for(int i=arr.length-1;i>=0;i-- ){
        int val=arr[i];
        int pos=(arr[i]/exp)%10;
        int no=freq[pos];
        res[no-1]=val;
        freq[pos]--;
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=res[i];
    }
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}*/

//SORT DATES
/*import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    countSort(arr,1000000,1,31);
    countSort(arr,10000,100,12);
    countSort(arr,1,10000,10000);
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    int[] newarr=new int[range+1];
    for(int i=0;i<arr.length;i++){
        int no=Integer.parseInt(arr[i]+"");
        int ino=(no/div)%mod;
        newarr[ino]++;
    }
    for(int i=1;i<newarr.length;i++){
        newarr[i]+=newarr[i-1];
    }
    String[] res=new String[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        int no=Integer.parseInt(arr[i]+"");
        String val=arr[i];
        int place=(no/div)%mod;
        //int nikal=newarr[place];
        res[(newarr[place])-1]=val;
        newarr[place]--;
        
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=(res[i]);
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}*/
//SORT01

/*import java.io.*;
import java.util.*;

public class Main {

  public static void sort01(int[] arr){
    int i=0,j=0;
    while(i<arr.length){
        if(arr[i]==1){
            i++;
        }
        else{
            swap(arr,i,j);
            i++;
            j++;
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}*/

//SORT012
/*import java.io.*;
import java.util.*;

public class Main {

  public static void sort012(int[] arr){
    int i=0,j=0,k=arr.length-1;
    while(i<=k){
        if(arr[i]==1){
            i++;
        }else if(arr[i]==0){
            swap(arr,i,j);
            i++;
            j++;
        }else{
            swap(arr,i,k);
            k--;
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }

}*/

//SELECTION SORT
/*import java.io.*;
import java.util.*;

public class Main {

  public static void selectionSort(int[] arr) {
      int n=arr.length;
    for(int itr=1;itr<n;itr++){
        int mine=itr-1;
        for(int j=itr;j<n;j++){
            if(isSmaller(arr,j,mine)){
                mine=j;
            }
        }
        swap(arr,itr-1,mine);
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    selectionSort(arr);
    print(arr);
  }

}*/

//QUICK SORT
/*import java.io.*;
import java.util.*;

public class Main {

  public static void quickSort(int[] arr, int lo, int hi) {
      if(lo>hi){
          return;
      }
      int piv=arr[hi];
    int idx=partition(arr,piv,lo,hi);
    quickSort(arr,lo,idx-1);
    quickSort(arr,idx+1,hi);
    
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    quickSort(arr, 0, arr.length - 1);
    print(arr);
  }

}*/