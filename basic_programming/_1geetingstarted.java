import java.util.Scanner;
/* //printz
class question1{
    public static void main(String[] args){
        int x=5;
        System.out.print("*****\n"+"   *\n"+"  *  \n"+" *\n"+"*****");
       
    }
} */
//Grading 
/* class Main{
    public static void main(String[] args){
     Scanner obj=new Scanner(System.in);
        int marks=obj.nextInt();
        if(marks>90)
          System.out.println("excellent");
        else if((marks>80)&&(marks<=90))
          System.out.println("good");
        else if((marks>70)&&(marks<=80))
          System.out.println("fair");
        else if((marks>60)&&(marks<=70))
          System.out.println("meets expectations");
        else System.out.println("below par");

    }
} */

//primeno
  /*  public class  ques3{
  public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      int t=obj.nextInt();
      while(t>0){
        int no=obj.nextInt();
        int count=0;
        for(int x=2;x*x<=no;x++)
            {
                if(no % x==0)
                 { count++;
                  break;}
            }
        if(count==1)
              System.out.println("not prime");
        else
              System.out.println("prime"); 
       t--;
      } 
   }
  }  */
 
/*

 //prime range
public class Main{
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int low=obj.nextInt();
        int high=obj.nextInt();
        int count=0; 
        while(low<=high)
        {  for(int i=2;i*i<=low;i++)
          {  if(low%i==0)
                { count++;
                  break;
                }
          }
          if(!(count==1))
               {
                   System.out.println(low);     
               }

            low++;
            count=0;
        }
        
    }
}  */

//fibonachi
/*  class Main{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int x=0;
        int n1=0;
        int n2=1;
        System.out.println(n1);
        System.out.println(n2);
        while((n-2)!=0)
       { x=n1+n2;
       System.out.println(x);
        n1=n2;
        n2=x;
        n--;}
    }
} */

//countdigit
/* class Main{
    public static void main(String[] args){
    Scanner obj =new Scanner(System.in);
    int n=obj.nextInt();
    int temp=n;
    int count=0;
    while(n!=0)
    {       
     n= n/10;
      count++;
    }
    System.out.println(count);

    } 
} */

  // print digits
  /*  public class Main{
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int temp=n;
        int count=0;
        while(temp!=0)
        { temp=temp/10;
        count++;  
        } 
        while(count!=0)
        { 
            int y=n/(int)(Math.pow(10,count-1));
            System.out.println(y);
            n=n % (int)(Math.pow(10,count-1));
            count--;
        }
     }
    } */

   // reversenumber
  /* public class Main{
   
   public static void main(String[] args) {
     Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        while(n!=0)
        {
          int y=n%10;
          System.out.println(y);
          n=n/10;
        } 
    }
   }   
 */
 //inverse
  /*  public class Main{

        public static void main(String[] args) {
          Scanner obj=new Scanner(System.in);
          int n=obj.nextInt();
          int temp=n;
          int no=0;
          int count=0;
          while(temp!=0)
          { temp=temp/10;
            count++;
          }
          for(int i=1;i<=count;i++)
          {  int x=n%10;
            n=n/10;
              no=no+(i*(int)(Math.pow(10,x-1))); 
          }
          System.out.println(no);
         }
        } */

  //ROTATE A NUMBER
/*    public class Main{
   
   public static void main(String[] args) {
     Scanner obj =new Scanner(System.in);
     int n=obj.nextInt();
     int k=obj.nextInt();
     int count=0;
     int ret=0;
     int temp=n;
     while(temp!=0){
        temp=temp/10;
        count++;
     }
     k=k%count;
     if(k<0){
         k=k+count;
     }
     
      int rem=n%(int)Math.pow(10,k);
       n=n/(int)Math.pow(10,k);
       ret=rem*((int)Math.pow(10,count-k))+n;
       System.out.println(ret);
     
     
    }
    } */
 // GCD AND LCM
  
    /* public class Main{
    
    public static void main(String[] args) {
      Scanner obj =new Scanner(System.in);
      int n1=obj.nextInt();
      int n2=obj.nextInt();
      int n1cpy=n1;
      int n2cpy=n2;
      int rem=n1%n2;
      while(rem!=0){
         n1=n2;
         n2=rem;
         rem=n1%n2;
      }
      System.out.println(n2);
      int lcm=(n1cpy*n2cpy)/n2;
      System.out.println(lcm);
     }
    }
    */

    //PRIME FACTORISATION
     /*  public class Main{

public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    for(int i=2;i*i<=n;i++){
        while(n%i==0)
        {
            System.out.print(i+" ");
            n=n/i;
        }
    } 
    if(n!=1){
        System.out.print(n);
    }
 }
} */
//PYTHAGORES TRIPLET
 /* public class Main{
  
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    int c=obj.nextInt();
    if(a>b&&a>c){
        int y=a*a;
       if(y==(b*b+c*c)){
           System.out.print("true");
       } else System.out.print("false");
    }
    if(b>a&&b>c){
        int k=b*b;
        if(k==(a*a+c*c)){
           System.out.print("true");
       } else  System.out.print("false");
    }
     if(c>a&&c>b){
        int z=c*c;
        if(z==(b*b+a*a)){
           System.out.print("true");
       } else System.out.print("false");
    }
     
   }
  } */
  //BENJAMIN BULB
  /*  public class Main{
  
  public static void main(String[] args) {
   Scanner obj=new Scanner(System.in);
   int n=obj.nextInt();
   for(int i=1;i*i<=n;i++){
       System.out.println(i*i);
   }
   }
  } */