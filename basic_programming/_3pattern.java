 import java.util.*;
//PATTERN 1
/*
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.print("*\t");
          }
          System.out.print("\n");
      }

    }
} */
 //PATTERN 2
/* 
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n=scn.nextInt();
         int star=n;
         for(int i =1;i<=n;i++){
             for(int j=1;j<=star;j++){
                 System.out.print("*\t");
             }
             star--;
             System.out.print("\n");
         }
        
    }
} */
//PATTERN 3

/* public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int star=1;
        int space=n-1;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=star;k++){
             System.out.print("*\t");
            }
            star++;
            space--;
            System.out.println();
        }
        

    }
}
 */
 //PATTERN 4
 /* public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
         int space=0;
         int star=n;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
               System.out.print("\t"); 
            }
            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.print("\n");
        }

    }
} */
//PATTERN 5
/* public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n=scn.nextInt();
       int space=n/2;
       int temp=n;
       int star=1;
       for(int i=1;i<=n;i++){
           
           for(int j=1;j<=space;j++){
               System.out.print("\t");
           }
           for(int k=1;k<=star;k++){
               System.out.print("*\t");
           }
           if(i<=(temp/2)){
           space--;
           star+=2;}
           else {
              space++;
              star-=2;
               
           }
           System.out.print("\n");
       }
       

    }
} */
//PATTERN 6
/* public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n/2;
        int star=n/2+1;
        int space=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            if(i<=temp){
                space+=2;
                star--;
            }
            else{
                star++;
                space-=2;
            }
            
            System.out.print("\n");
        }
       

    }
} */
// PATTERN 7
/* public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n=scn.nextInt();
       int space=0;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=space;j++){
               System.out.print("\t");
           }
           System.out.print("*\t");
           space++;
           System.out.print("\n");
       }
       

    }
} */
// PATTERN 8
/* public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            space--;
            System.out.print("\n");
        }
       

    }
} */
//PATTERN 9
/* public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
      for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
              if(i==j||j+i==n+1){
                  System.out.print("*\t");
              }
              else System.out.print("\t");
            }
          System.out.print("\n");
        }

    }
} */
//PATTERN 10
/* public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int space =n/2;
    int space2=-1;
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=space;j++){
            System.out.print("\t");
        }
        System.out.print("*\t");
        for(int k=1;k<=space2;k++){
           System.out.print("\t");
        }
        if(i>1&&i<n){
            System.out.print("*\t");
        }
        if(i<=n/2){
            space--;
            space2=space2+2;
        }
        else{
            space++;
            space2=space2-2;
        }
        System.out.print("\n");
    }
 }
} */
//PATTERN 11
/* 
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
      int count=1;
      for(int i=1;i<=n;i++){
         
          for(int j=1;j<=i;j++){
              System.out.print(count+"\t");
               count++;
          }
          System.out.print("\n");
      }
       

    }
} */
// PATTERN 12
 /*public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n=scn.nextInt();
       int x1=0;
       int x2=1;
       int sum=0;
       int z=1;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
                
               System.out.print(sum+"\t");
              sum=x1+x2;
                if(z<=0){x1=x2;
                x2=sum;
                    ;
                }
                z--;
           }
           
           System.out.print("\n");
       }
        

    }
}*/
//PATTERN 13

/* public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int icj=1;
        int icjcpy=0;
        for(int i=0;i<n;i++){
            icj=1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                icjcpy=icj*(i-j)/(j+1);
                icj=icjcpy;
            }
            System.out.print("\n");
            
        }

    }
} */
// PATTERN 14
/*
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int x=scn.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x+" " +"* "+i +" "+"= "+x*i);
        }

    }
} */
//pattern 15
/*
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n/2;
        int star=1;
        int outc=1;
        int iutc=0;
        for(int i=1;i<=n;i++ ){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            iutc=outc;
            for(int k=1;k<=star;k++){
                
                System.out.print(iutc+"\t");
                if(k<=star/2){
               iutc++;}
               else{
                   iutc--;
               }
            }
            if(i<=n/2){
                space--;
                star+=2;
                outc++;
            }
            else{
                space++;
                star-=2;
                outc--;
            }
            System.out.print("\n");
        }
       

    }
}*/
//PATTERN 16
/*
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
      int star=1;
      int space=2*n-3;
      int num=0;
      for(int i=1;i<=n;i++){
          num=0;
          for(int j=1;j<=star;j++){
              num++;
              System.out.print(num+"\t");
              
          }
          for(int k=1;k<=space;k++){
              System.out.print("\t");
          }
          if(i==n){
              star--;
              num--;
          }
          for(int j=1;j<=star;j++){
              System.out.print(num+"\t");
              num--;
          }
          star++;
          space-=2;
          System.out.print("\n");
      }
    

 }
}
 */
 //PATTERN 17 
 /*public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int space =n/2;
        int star=  1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                if((j<=star/2)&&(i!=n/2+1)){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
                
            }
            if(i<=n/2){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            System.out.print("\n");
            
        }

    }
}*/
//PATTERN 18
/*
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int space=0;
    int star=n;
    for(int i=1;i<=n ;i++){
        for(int j=1;j<=space;j++){
          System.out.print("\t");  
        }
        for(int k=1;k<=star;k++){
            if(i>1 &&i<=n/2 &&k>1&&k<star){
                System.out.print("\t");
            }else{
          System.out.print("*\t"); }
        }
        if(i<=n/2){
            space++;
            star-=2;
        }
        else{
            space--;
            star+=2;
        }
        System.out.print("\n");
    }

 }
}*/
// PATTERN  19
/*
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1){
               if(j<=(n/2)+1||j==n){
                   System.out.print("*\t");
               }else
             {
                 System.out.print("\t");
             }
           
            }
            else if(i<=n/2){
               if(j==(n/2)+1||j==n){
                   System.out.print("*\t");
               } else{
                   System.out.print("\t");
               }
            }
            else if(i==(n/2)+1){
               System.out.print("*\t"); 
            }
            else if(i<n){
                if(j==1||j==(n/2)+1){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            else{
               if(j==1||j>n/2){
                   System.out.print("*\t");
               } else {
                   System.out.print("\t");
               }
            }
        }
        System.out.print("\n");
    }

 }
}*/
//PATTERN 20
/*
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n-2;
        for(int i=1;i<=n;i++){
            System.out.print("*\t");
            for(int j=1;j<=space;j++){
                if(i<=n/2||i==n){
                    System.out.print("\t");
                } 
                else{
                    if(i+j==n||i==j+1){
                        System.out.print("*\t");
                    } 
                    else {System.out.print("\t");}
                    
                }
            } if(n!=1){
            System.out.print("*\t");}
            System.out.print("\n");
        }

    }
}*/