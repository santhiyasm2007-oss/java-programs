/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static int sumofdigits(int n){
	    int sum=0;
	    while(n>0){
	        int r=n%10;
	        sum=sum+r;
	        n=n/10;
	    }
	    return sum;
	}
	public static int single(int n){
	    while(n>10){
	        int ans=sumofdigits(n);
	        n=ans;
	    }
	    return n;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=sumofdigits(n);
	    System.out.println(ans);
	}
}