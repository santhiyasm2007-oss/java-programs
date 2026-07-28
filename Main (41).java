/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static int bitodec(int n) {
	    int ans=0;
	    int r=0;
	    int x=1;
	    while(n>0){
	        r=n%10;
	        ans=ans+(r*x);
	        x=x*2;
	        n=n/10;
	    }
	    return ans;
	}
	public static int dectooct(int n){
	    int ans2=0;
	    int r=0;
	    int x2=1;
	    while(n>0){
	        r=n%8;
	        ans2=ans2+r*x2;
	        x2=x2*10;
	        n=n/8;
	    }
	    return ans2;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int dec=bitodec(n);
	    System.out.println("decimal ="+dec);
	    int oct=dectooct(dec);
	    System.out.println(oct);
	}
}