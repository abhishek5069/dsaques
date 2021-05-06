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
// ANY BASE SUBTRACTION
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

  //FIND ELEMENT IN ARRAY
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
// ROTATE

/*
public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  public static void rotateparts(int[]arr,int a,int b){
      while(a<b){
      int temp  =arr[a];
      arr[a]=arr[b];
      arr[b]=temp;
      a++;
      b--;
    }
  }

  public static void rotate(int[] a, int k){
    k=k%a.length;
    if(k<0){
        k=k+a.length;
    }
    rotateparts(a,0,a.length-k-1);
    rotateparts(a,a.length-k,a.length-1);
    rotateparts(a,0,a.length-1);

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

} */

//INVERSE
/*
public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
     int n[]=new int[a.length];
    for(int i=0;i<a.length;i++){
        n[a[i]]=i;
    }
    return n;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

} */
//SUM OF ARRAY
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int a[]=new int[n1];
    for(int i=0;i<a.length;i++){
        a[i]=scn.nextInt();
    }
    int n2=scn.nextInt();
    int b[]=new int[n2];
    for(int i=0;i<b.length;i++){
        b[i]=scn.nextInt();
    }
    int size=n1>n2 ?n1:n2;
    int c[]=new int[size];
    int carry=0;
    int p1=a.length-1; int p2=b.length-1; int p3=size-1;
    while(p1>=0||p2>=0){
        int d1=p1<0?0:a[p1];
        int d2=p2<0?0:b[p2];
        int sum=d1+d2+carry;
        int digit=sum%10;
        c[p3]=digit;
        carry=sum/10;
        p1--;
        p2--;
        p3--;
    }
    if(carry!=0){
        System.out.println(carry);
    }
    for(int z=0;z<size;z++){
        System.out.println(c[z]);
    }
    
 }

} */
//SUBTRACT ARRAY
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int a[]=new int[n1];
    for(int i=0;i<a.length;i++){
        a[i]=scn.nextInt();
    }
    int n2=scn.nextInt();
    int b[]=new int[n2];
    for(int i=0;i<b.length;i++){
        b[i]=scn.nextInt();
    }
    int size=n1>n2 ?n1:n2;
    int c[]=new int[size];
    int borrow=0;
    int p1=a.length-1; int p2=b.length-1; int p3=size-1;
    while(p2>=0){
        int d1=p1<0?0:a[p1];
        int d2=p2<0?0:b[p2];
        int diff=d2-d1+borrow;
        if(diff<0){
            diff=diff+10;
            borrow=-1;
        }
        else{
            borrow=0;
        }
        c[p3]=diff;
        p1--;
        p2--;
        p3--;
    }
   boolean flag=false;
   for(int i=0;i<size;i++){
       if(c[i]!=0){
           flag=true;
       }
       if(flag){
           System.out.println(c[i]);
       }
   }
    
 }

}  */
//BINARY SEARCH(ceil,floor) BROKEN ECONOMY
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=scn.nextInt();
    }
    int d=scn.nextInt();
    int low=0;
    int hig=a.length-1;
    int ceil=-1;
    int floor=-1;
    while(low<=hig){
        int mid=(low+hig)/2;
        if(a[mid]==d){
           ceil=a[mid];
           floor=a[mid];
           break;
        }
        else if(d<a[mid]){
          hig=mid-1;
          ceil=a[mid];
        }
        else{
            low=mid+1;
            floor=a[mid];
        }
        
    }
    System.out.println(ceil);
    System.out.println(floor);
    
 }

} */
// BINARY SEAARCH(FIRST INDEX LAST INDEX)
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    int f=getfirstindex(a,0,n-1,d);
    System.out.println(f);
    int l=getlastindex(a,f,n-1,d);
    System.out.println(l);
    
 }
 public static int getfirstindex(int a[],int lb,int ub, int k)
 {
    int first=-1;
    while(lb<=ub)
    {
        int mid=(lb+ub)/2;
        if(a[mid]==k)
        {
            first=mid;
            ub=mid-1;
        }
        else if(a[mid]>k)
        {
            ub=mid-1;
        }
        else
        {
            lb=mid+1;
        }
    }
    return first;
 }
 public static int getlastindex(int a[],int lb,int ub,int k)
 {
    int last=-1;
    while(lb<=ub)
    {
        int mid=(lb+ub)/2;
        if(a[mid]==k)
        {
            last=mid;
            lb=mid+1;
        }
        else if(a[mid]>k)
        {
            ub=mid-1;
        }
        else
        {
            lb=mid+1;
        }
    }
    return last;
 } 

} */
//PRINT SUBARRAY OF ARRAY
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
           
            for(int k=i;k<=j;k++)
            {
                System.out.print(a[k]+"\t");
            }
            System.out.println();
        }
        
    }
 }

} */
// subset
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++){
        a[i]=obj.nextInt();
    }
    printseq(a);
 }
 public static void printseq(int[] a){
     int totbi=(int)Math.pow(2,a.length);
     for(int i=0;i<totbi;i++){
         int bino=getbinary(i);
         result(a,bino);
     }
 }
 public static int getbinary(int num){
     int i=0;
     int res=0;
     while(num>0){
         int rem=num%2;
         num=num/2;
         res=res+rem*(int)Math.pow(10,i);
         i++;
     }
     return res;
 }
 public static void result(int a[],int bi ){
     String str="";
     int z=a.length;
     int idx=a.length-1;
     while(z!=0){
         int ld=bi%10;
         bi=bi/10;
         if(ld==0){
             str="-"+"\t"+str;
         }else {
            str= a[idx]+"\t"+str; 
         }
         idx--;  
         z--;
        
     }
     System.out.println(str);
 
 }

}
*/