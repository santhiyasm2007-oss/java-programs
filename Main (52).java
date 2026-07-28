/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		main(size,arr);
	}
	public static void main(int size,int arr[]){
		int evencount=0,oddcount=0;
		for(int i=0;i<size;i++){
		    if(arr[i]%2==0){
		        evencount++;
		    }
		    else{
		        oddcount++;
		    }
		}
		System.out.print(evencount+"\n"+oddcount);
	}
}