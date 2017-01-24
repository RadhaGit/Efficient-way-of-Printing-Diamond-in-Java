package com.opps.practice;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// Length of Horizontal Diagonal
		int n=input.nextInt();
		//Validating Length of Horizontal Diagonal as Odd number
		if(n%2==0){
		System.out.println("Diamond looks good when length of diagonal is ood number, SO pick an odd number. Either "+(n+1)+" Or "+(n-1)+" Any other");
		n=input.nextInt();
		}
		//Helper variable for padding spaces
		int m=(n/2);
		//Empty String by StringBuilder,We can also use String as well but it is highly in-efficient as we have so many update operations  
		StringBuilder s=new StringBuilder("");
		//Helper variable for padding spaces
		int x;
		//Top Triangle
		for(int i=1;i<=n;i++){
			x=i+m;
			s.append("*");
			// Only print the Strings of odd number lengths {For good shape}
			if(i%2==0)
				continue;
			System.out.println(String.format("%1$" + x+ "s",s));
			m=m-1;
		}
		//Bottom Triangle
		m=1;
		for(int i=0;i<n;i++){
			x=n-m;
			//Deleting a character each time
			s.deleteCharAt(0);
			// Only print the Strings of odd number lengths {For good shape}
			if(i%2==0)
				continue;
			//// Only printing the Strings of odd number lengths {For good shape}
			System.out.println(String.format("%1$" + x+ "s",s));
			m=m+1;
		}
	}

}
