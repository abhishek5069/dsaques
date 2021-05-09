import java.io.*;
import java.util.*;
// DEMO
/*
public class Main{

public static void main(String[] args) throws Exception {
   Scanner obj=new Scanner(System.in);
   int r=obj.nextInt();
   int c=obj.nextInt();
   int a[][]=new int[r][c];
   for(int i=0;i<r;i++){
       for(int j=0;j<c;j++){
           a[i][j]=obj.nextInt();
       }
   }
   for(int i=0;i<r;i++){
       for(int j=0;j<c;j++){
           System.out.print(a[i][j]+" ");
       }
       System.out.println();
   }
   
 }

}  */
//state of wakanda 1
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            a[i][j]=sc.nextInt();
        }
        
    }
    
    for(int i=0;i<c;i++)
    {
        if(i%2!=0)
        {
            for(int j=r-1;j>=0;j--)
            {
                System.out.println(a[j][i]);
            }
        }
        else
        {
            for(int j=0;j<r;j++)
            {
                System.out.println(a[j][i]);
            }
        }
    }
    
}
} */
//matrix multiplication
/*
public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c1;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int b[][]=new int[r2][c2];
    for(int i=0;i<r2;i++)
    {
        for(int j=0;j<c2;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
    int c[][]=new int[r1][c2];
   if(c1!=r2){
       System.out.print("Invalid input");
   }
   else{
   
   for(int i=0;i<r1;i++){
       for(int j=0;j<c2;j++){
           for(int k=0;k<r2;k++){
               c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
           }
       }
   }
   for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c2;j++)
        {
            System.out.print(c[i][j]+" ");
        }
       System.out.println();   
    }
       
   }
    
 }

} */
//spiral multiplication
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scn.nextInt();
            }
        }
        spiral(a);
  
    }
    public static void spiral(int a[][]){
        int rmin=0,cmin=0,rmax=a.length-1,cmax=a[0].length-1;
        int count=0;
        int total=a.length*a[0].length;
        while(count<total){
            for(int i=rmin,j=cmin;i<=rmax&&count<total;i++){
                System.out.println(a[i][j]);
                count++;
            }
            for(int i=rmax,j=cmin+1;j<=cmax&&count<total;j++){
                System.out.println(a[i][j]);
                count++;
            }
            for(int i=rmax-1,j=cmax;i>=rmin&&count<total;i--){
                System.out.println(a[i][j]);
                count++;
            }
            for(int i=rmin,j=cmax-1;j>=cmin+1&&count<total;j--){
                System.out.println(a[i][j]);
                count++;
            }
            rmax--;
            cmax--;
            rmin++;
            cmin++;
            
        }
    }

} */
//exit point
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        
        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
        // logic 
        int i = 0 , j = 0 , dir = 0;
        int prei=-1,prej=-1;
        while(i>=0&&j>=0&&i<nr&&j<nc){
             dir=(dir+mat[i][j])%4;
             prei=i;
             prej=j;
            if(dir==0){
                j=j+1;
            }
            else if(dir==1){
                i=i+1;
            }
            else if(dir==2){
                j=j-1;
            }
            else{
                i=i-1;
            }
        }
        System.out.println(prei);
        System.out.println(prej);
    }

} */
//rotate by 90
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
        transpose(mat);
        reverseRowWise(mat);
        display(mat);
    }
    public static void transpose(int mat[][]){
        int n=mat.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
               int temp= mat[i][j];
               mat[i][j]=mat[j][i];
               mat[j][i]=temp;
            }
        }
        
    }
    
    public static void reverseRowWise(int mat[][]){
          
        for(int i=0;i<mat.length;i++){
            int hi=mat[0].length-1;
            int lo=0;
            int j=mat.length;
            int no=j/2;
            while(no>0){
                int temp=mat[i][lo];
                mat[i][lo]=mat[i][hi];
                mat[i][hi]=temp;
                no--;
                lo++;
                hi--;
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

} */
//state of wakanda 2
/*public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[][]=new int[n][n];;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scn.nextInt();
            }
        }
        for(int gap=0;gap<n;gap++){
            for(int r=0,c=gap;r<n&&c<n;r++,c++){
                System.out.println(a[r][c]);
            }
        }
    }

}*/
//search in sorted 2d
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scn.nextInt();
            }
        }
        int d=scn.nextInt();
        int r=0,c=a[0].length-1;
        while(c>=0&&r<n){
            if(d==a[r][c]){
                System.out.println(r);
                System.out.println(c);
                return;
            }else if(d<a[r][c]){
                c--;
            }else {
                r++;
            }
        }
        System.out.println("Not Found");
    }

} */
//2 ques left