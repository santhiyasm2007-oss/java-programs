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
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=bitodec(n);
	    System.out.println(ans);
	}
}