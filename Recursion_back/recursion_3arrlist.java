import java.io.*;
import java.util.*;

//gET SUBSEQUENCE
/*
public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         String st=scn.nextLine();
         ArrayList<String> res=gss(st);
         System.out.print(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        ArrayList<String> s=gss(roq);
        ArrayList<String> res=new ArrayList<>();
        for(String x:s){
            res.add(x);
        }
        for(String x:s){
            res.add(ch+x);
        }
        return res;
    }

}*/

//GET MAZE PATHS
/*
public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int m=scn.nextInt();
      ArrayList<String> res=getMazePaths(0,0,n-1,m-1);
      System.out.print(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) { if(sc==dc&&sr==dr){
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
    }
        ArrayList<String> re=new ArrayList<>();
     if(sc<=dc){
         ArrayList<String> hpath=getMazePaths(sr,sc+1,dr,dc);
         for(String x:hpath){
             re.add("h"+x);
         }
     }
     if(sr<=dr){
         ArrayList<String> vpath=getMazePaths(sr+1,sc,dr,dc);
         for(String x:vpath){
             re.add("v"+x);
         }
     }
     return re;
    }

}*/
//GET STAIRS PATHS
/*
public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      ArrayList<String> res=getStairPaths(n);
      System.out.print(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(n<0){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }
        ArrayList<String> ans=new ArrayList<>();
       ArrayList<String> step1=getStairPaths(n-1);
       for(String x:step1){
           ans.add("1"+x);
       }
       ArrayList<String> step2=getStairPaths(n-2);
       for(String x:step2){
           ans.add("2"+x);
       }
       ArrayList<String> step3=getStairPaths(n-3);
       for(String x:step3){
           ans.add("3"+x);
       }
       return ans;
    }

}*/

//GET KPC
/*public class Main {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    ArrayList<String> l=getKPC(s);
    System.out.println(l);
    }
    
    public static String keypad[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        
        if(str.length()==0)
        {
            ArrayList<String> l=new ArrayList<>();
            l.add("");
            return l;
        }
       
        String s=str.substring(1);
        ArrayList<String> l1=getKPC(s);
        
        int n=(Integer.parseInt(str.charAt(0)+""));
        String word=keypad[n];
        ArrayList<String> l=new ArrayList<>();
        
            for(int i=0;i<word.length();i++)
            {
                for(String x: l1)
                {
                    l.add(word.charAt(i)+x);
                }
            }
        
        return l;
    }

}*/