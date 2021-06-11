import java.io.*;
import java.util.*;
 //subs and palindrome
 /*
public class Main {

	public static void solution(String str){
		for(int i=0;i<=str.length()-1;i++){
		    for(int j=i+1;j<=str.length();j++){
		        String st2=(str.substring(i,j));
		        checkpali(st2);
		    }
		}
		
	}
	public static void checkpali(String st2){
	    if(st2.length()==1){
	        System.out.println(st2);
	    }
	    else{
	        int k=st2.length()/2;
	        int ch=k;
	        int count=0;
	        int st=0;
	        int lt=st2.length()-1;
	        while(k>0){
	            
	            if(st2.charAt(st)==st2.charAt(lt)){
	                count++;
	            }
	            st++;
	            lt--;
	            k--;
	        }
	        if(count==ch){
	            System.out.println(st2);
	        }
	    }
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

} */
//string compression
/*
public class Main {

	public static String compression1(String str){
	   String s2="";
		for(int i=0;i<str.length();i++){
		     s2+=str.charAt(i);
		    
		    while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
		        i++;
		    }
		   
		}

		return s2;
	}

	public static String compression2(String str){
		String s2="";
		for(int i=0;i<str.length();i++){
		     s2+=str.charAt(i);
		      int count=0;
		    while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
		        i++;
		        count++;
		    }
		    if(count>0){
		        count=count+1;
		        s2=s2+count;
		    }
		   
		}

		return s2;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

} */
//toggle alphabet
 /*
public class Main {

	public static String toggleCase(String str){
		String s2="";
		for(int i=0;i<str.length();i++){
		    
		    if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
		        char j=(char)(str.charAt(i)+32);
		        s2+=j;
		    }
		    else{
		        char k=(char)(str.charAt(i)-32);
		        s2+=k;
		    }
		}

		return s2;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

} */
//print all permutation
/*
public class Main {

	public static void solution(String str){
		int fact=factori(str.length());
		for(int i=0;i<fact;i++){
		    int n=str.length();
		    int temp=n;
		    int val=i;
		    StringBuilder perm=new StringBuilder();
		    StringBuilder mstr=new StringBuilder(str);
		    while(temp!=0){
		        int rem=val%temp;
		        val=val/temp;
		        perm.append(mstr.charAt(rem));
		        String lp=mstr.substring(0,rem);
		        String up=mstr.substring(rem+1);
		        mstr.delete(0,mstr.length());
		        mstr.append(lp);
		        mstr.append(up);
		        temp--;
		    }
		    System.out.println(perm);
		}
		
	}
	public static int factori(int num){
	    int res=1;
	    for(int i=1;i<=num;i++){
	        res=res*i;
	    }
	    return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
*/

//remove prime
/*
public class Main {

	public static void solution(ArrayList<Integer> al){
		for(int i=al.size()-1;i>=0;i--){
		    //int j=al.get(i);
		    if(isprime(al.get(i))){
		        al.remove(i);
		    }
		}
		
	}
	public static boolean isprime(int val){
	    int count=1;
	    for(int i=2;i*i<=val;i++){
	        if(val%i==0){
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}  */