/* String Pattern1: 
Write a program to print the following output for the given input you can assume the string is of outlet 
Example 1: 
Input: 12345
output:1   5
        2 4
	 3
        2 4
       1   5
*/
import java.util.*;
class StringPattern1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		int i=0,j=s.length()-1;
		boolean flag=true;
		while(i>=0 && j<=s.length()-1)
		{
			for (int k=0;k<s.length();k++ )
			{
				char ch=s.charAt(k);
				if (k==i || k==j)
				{
					System.out.print(s.charAt(k));
					if (i==j)
					{
						flag=false;
					}
				}
				
				else 
				{
					System.out.print(" ");
				}
			}
			if (flag)
			{
				i++;
				j--;
			}
			else 
			{
				i--;
				j++;
			}
			System.out.println();
		}
	}
}
