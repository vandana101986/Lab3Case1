package com.gl.Driver;
import java.util.Scanner;

import com.gl.brackets.BalancedBrackets;

public class Driver {	

	public static void main(String[] args)
	{
		BalancedBrackets bb=new BalancedBrackets();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Program to check Bracket Balance");
		System.out.println("Enter a brackets expression : ");
		String str = sc.nextLine();
		Boolean check= bb.checkBalanced(str);
		
			
		if (check)
			System.out.println("The entered String has Balanced Brackets\r\n"+ "");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
		
		sc.close();
	}	
}
