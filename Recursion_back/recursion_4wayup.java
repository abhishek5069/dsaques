import java.io.*;
import java.util.*;
// print subsequence
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        String emp="";
        printSS(str,emp);

    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
       char ch=str.charAt(0);
       String roq=str.substring(1);
       printSS(roq,ans+ch);
       printSS(roq,ans);
    }
} */

//PRINT STAIRPATHS

/*
public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      String path="";
      printStairPaths(n,path);
      
    }
    

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }
     if(n-1>=0){ 
     printStairPaths(n-1,path+"1");}
     if(n-2>=0){ 
     printStairPaths(n-2,path+"2");}
     if(n-3>=0){ 
     printStairPaths(n-3,path+"3");}
        
    }
}    */

//PRINT KPC
/*

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      String str=scn.nextLine();
      String asf="";
      printKPC(str,asf);
    }
    public static String kpc[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
    char ch=str.charAt(0);
    String roq=str.substring(1);
    String word=kpc[Integer.parseInt(ch+"")];
    for(int i=0;i<word.length();i++){
        printKPC(roq,asf+word.charAt(i));
    }
    }

}*/

//PRINT MAZE PATHS
/*
	public class Main {

	    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int m=scn.nextInt();
         printMazePaths(0,0,n-1,m-1,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        if(sr==dr&&sc==dc){
	            System.out.println(psf);
	            return;
	        }
	       if(sc+1<=dc){
	           printMazePaths(sr,sc+1,dr,dc,psf+"h");
	       }
	       if(sr+1<=dr){
	           printMazePaths(sr+1,sc,dr,dc,psf+"v");
	       }
	    }

	}*/

//PRINT MAZE PATHS WITH JUMPS
/*
public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int m=scn.nextInt();
      printMazePaths(0,0,n-1,m-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {if(sr==dr&&sc==dc){
        System.out.println(psf);
        return;
    }
        
       for(int i=1;sc+i<=dc;i++){
           printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
       }
       for(int i=1;sr+i<=dr;i++){
           printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
       }
       for(int i=1;sc+i<=dc&&sr+i<=dr;i++){
           printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i);
       }
    }

} */

//PRINT PERMUTATIONS
/*
public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn=new Scanner(System.in);
     String str=scn.nextLine();
     printPermutations(str,"");
        
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
       for(int i=0;i<str.length();i++){
           if(i==0){
               char ch=str.charAt(i);
               printPermutations(str.substring(1),asf+ch);
           }
           else if(i>0&&i<str.length()-1){
             char ch=str.charAt(i);
             String s1=str.substring(0,i);
             String s2=str.substring(i+1);
             String ans=s1+s2;
             printPermutations(ans,asf+ch);
           }
           else {
               char ch=str.charAt(i);
               String pass=str.substring(0,i);
               printPermutations(pass,asf+ch);
           }
       } 
    }

}*/

// PRINT ENCODINGS
/*
public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn=new Scanner(System.in);
     String str=scn.nextLine();
     printEncodings(str,"");
    }

    public static void printEncodings(String str,String emp) {
        if(str.length()==0){
            System.out.println(emp);
            return;
        }
       if(str.charAt(0)=='0'){
           return;
       }
       char ch=str.charAt(0);
       
       int num=Integer.parseInt(ch+"");
       printEncodings(str.substring(1),emp+(char)('a'+num-1));
       
       if(str.length()>1){
           char ch2=str.charAt(1);
           int num2=Integer.parseInt(""+ch+ch2);
           if(num2>9&&num2<27){
           printEncodings(str.substring(2),emp+(char)('a'+num2-1));}
       }
    }

}*/