import java.io.*;
import java.util.*;
//FREQUENCY
/*
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int count=0;
        while(n!=0){
            int d1=n%10;
            if(d1==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}*/
//DECIMAL TO ANY BASE
/*
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int sum=0;
       int i=0;
       int rem=0;
       while(n>0){
           rem=n%b;
           sum=sum+rem*(int)Math.pow(10,i);
           i++;
           n=n/b;
           
           
       } 
       return sum;
   }
  } */
  // ANY BASE TO DECIMAL
  /*
   public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int i=0;
      int rem=0;
      int sum=0;
      while(n>0){
         rem=n%10;
         sum=sum+rem*(int)Math.pow(b,i);
         n=n/10;
         i++;
      }
      return sum;
   }
  } */
  //ANYBASE TO ANYBASE
  /*
    public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int deci=anytodeci(n,sourceBase);
     int result=decitoany(deci,destBase);
     System.out.print(result);
   } 
   public static int anytodeci(int n,int b){
      int i=0;
      int rem=0;
      int sum1=0;
      while(n>0){
         rem=n%10;
         sum1=sum1+rem*(int)Math.pow(b,i);
         n=n/10;
         i++;
      }
      return sum1;
   }
    public static int decitoany(int n, int b){
       int sum=0;
       int i=0;
       int rem=0;
       while(n>0){
           rem=n%b;
           sum=sum+rem*(int)Math.pow(10,i);
           i++;
           n=n/b;
       } 
       return sum;
   }
  } */
  //ANY BASE ADDITION
  /*
    public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int rem=0;
       int d1=0;
       int d2=0;
       int res=0;
       int i=0;
       int sum=0;
       int x=0;
       while(n1>0||n2>0||rem>0){
           d1=n1%10;
           d2=n2%10;
           sum=d1+d2+rem;
           x=sum%b;
           rem=sum/b;
           res=res+x*(int)Math.pow(10,i);
          n1= n1/10;
           n2=n2/10;
           i++;
       }
       return res;
   }
  }*/
//SUBTRACTION
  /*
   public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
      int d1=0;
      int d2=0;
      int res=0;
      int borrow=0;
      int i=0;
      int sub=0;
      while(n2>0){
          d1=n2%10;
          d2=n1%10;
          n1=n1/10;
          n2=n2/10;
          sub=d1-d2+borrow;
          if(sub<0){
              sub=sub+b;
              borrow=-1;
          }else {
              borrow=0;
          }
          res=res+sub*(int)Math.pow(10,i);
          i++;
      }
      return res;
   }
  
  } */

  //NO PRESENT IN ARRAY OR NOT
  /*
  public class Main{

public static void main(String[] args) throws Exception {
   Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++){
      a[i]=scn.nextInt();
   }
   int d=scn.nextInt();
   int count=0;
   
   for(int i=0;i<a.length;i++){
       if(d==a[i]){
           System.out.println(i);
           count++;
           break;
       }
       
   }
   if(count==0){
       System.out.print("-1");
   }
 }

}*/
// SPAN OF TREE

/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i=0;
    int a[]=new int[n];
    for(int j=0;j<a.length;j++){
        a[j]=scn.nextInt();
    }
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    while(n>0){
        if(a[i]>max){
            max=a[i];
        }
        if(a[i]<min){
            min=a[i];
        }
        i++;
        n--;
    }
    System.out.println(max-min);
 }

} */
//REVERSE ARRAY
/*
public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
public static void Swap(int[]arr,int a,int b){
      int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
      
  }

  public static void reverse(int[] a){
      int i=0;
    int j=a.length-1;
    // for(int i=0;i<(a.length)/2;i++){
    //     Swap(a,i,j);
    //     j--;
    // }
    while(i<j){
        Swap(a,i,j);
        i++;
        j--;
    }
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}*/
//BAR CHART
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=scn.nextInt();
    }
    int temp=n;
    int max=Integer.MIN_VALUE;
    for(int j=0;j<n;j++){
        if(a[j]>max){
            max=a[j];
        }
    }
    
    while(max>0){
        for(int i=0;i<n;i++){
            if(a[i]<max){
                System.out.print("\t");
            }
            else System.out.print("*\t");
        }
        System.out.print("\n");
        max--;
    }
 }

}
*/