/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static boolean prime(int n) {
	    int fact=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0){
			    fact++;
			}
		}
		return fact==2;
	}
public static int reverse(int n) {
	int rev=0;
	while(n>0) {
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	return rev;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean fact=prime(n);
	int rev=reverse(n);
	boolean revfact=prime(rev);
	if(fact&&revfact){
	    System.out.println(" twisted prime");
	}
	else {
		System.out.println("not twisted prime");
	}
	System.out.println();
}
}