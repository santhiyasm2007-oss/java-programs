/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static int digit(int n) {
	    int count=0;
	    while(n>0){
	        int rem=n%10;
	        count++;
	        n=n/10;
	    }
	    return count;
		
	}
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=digit(n);
	    System.out.println(a);
	}
}
