package leetprblms;
import java.util.*;
public class romanToNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		 char[] ch=s.toCharArray();
		 int[] n=new int[ch.length+1];
	       for(int i=0;i<ch.length;i++){
	       if(ch[i]=='I')
	       n[i]=1;
	       else if(ch[i]=='V')
	       n[i]=5;
	       else if(ch[i]=='X')
	       n[i]=10;
	       else if(ch[i]=='L')
	       n[i]=50;
	       else if(ch[i]=='C')
	       n[i]=100;
	       else if(ch[i]=='D')
	       n[i]=500;
	       else 
	       n[i]=1000;
	   }
	       int sum=0;
	       int l=n.length;
		   for(int i=0;i<l;i++) {
			   if( i+1<l && n[i]>=n[i+1]  )
			   sum=sum+n[i];
			   else
				   sum=sum-n[i];
		   } 
	   System.out.print(sum); 
	    }
	}


