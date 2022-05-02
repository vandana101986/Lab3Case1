package com.gl.brackets;
import java.util.*;

public class BalancedBrackets {				
			
			public boolean checkBalanced(String str)
			{
				Stack<Character> stack=new Stack<Character>();

				for (int i = 0; i < str.length(); i++)
				{
					char c = str.charAt(i);
					if (c == '(' || c == '[' || c == '{')
					{
						stack.push(c);
						continue;
					}

					if (stack.isEmpty()) {
						return false;
					}
						
					char check;
					switch (c) {
					case ')':
						check = stack.pop();
						if (check != '(')
							return false;
						break;

					case '}':
						check = stack.pop();
						if (check != '{')
							return false;
						break;

					case ']':
						check = stack.pop();
						if (check != '[')
							return false;
						break;
					}					
				}
			
				return (stack.isEmpty());
			}		
			

		
	}	

