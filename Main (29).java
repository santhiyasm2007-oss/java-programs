/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static int primecount(int n,int sum) {
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        sum=sum+i;
		}}
		return sum;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=primecount(n,0);
	    System.out.println(sum);
	   
	}
}