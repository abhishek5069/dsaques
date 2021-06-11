import java.io.*;
import java.util.*;
 //decreasing
 /*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

}
*/
//print increasing
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n==0){
            return ;
        }
        printIncreasing(n-1);
        System.out.println(n);
        
    }

}
*/
//increasing decreasing
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
        
    }

} */
//print odd
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n<=0){
            return;
        }
        if(n%2==0){
            n=n-1;
        }
        pdi(n-2);
        System.out.println(n);
        
    }

} */
//factorial
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int res=factorial(n);
        System.out.println(res);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

}*/
//print linear power

/*
public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
       int x=scn.nextInt();
       int n=scn.nextInt();
       System.out.println(powerl(x,n));
    }

    public static int powerl(int x, int n){
        if(n==0){
            return 1;
        }
        int res=x*powerl(x,n-1);
        return res;
    }

}*/

 //power lagorithmk
 /*
public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
       int x=scn.nextInt();
       int n=scn.nextInt();
       System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
         
        int res=power(x,(n/2));
        if(n%2==0){
           
            return res*res;
        }else{
            return x*res*res;
        }
        
       
    }

}*/
//print zigzag
/*
public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       pzz(n);
    }

    public static void pzz(int n){
        if(n==1){
            System.out.print("1 1 1 ");
            return;
        }
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        
        
    }

}*/
//tower of hanoi
/*
public class Main {

   public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int src=sc.nextInt();
        int dest=sc.nextInt();
        int help=sc.nextInt();
        toh(src,dest,help,n);
    }

    public static void toh(int src, int dest, int help, int n){
        if(n==0){
            return;
        }
        toh(src,help,dest,n-1);
        System.out.println(n+"["+src+" -> "+dest+"]");
        toh(help,dest,src,n-1);
    }
} */