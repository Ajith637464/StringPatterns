/* String Pattern4

Input: aa3bb4ccc5f3
output: aaaaaabbbbbbbbcccccccccccccccfff

Input: a1b2c3d4
Output: abbcccdddd

*/
import java.util.*;
class StringPattern4 
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.print("Input: ");
		String s=sc.nextLine();
		System.out.print("output: ");
		String ss="";
		String num="";
		boolean a=false,b=false;
		char ch2=' ';
		for (int i=0;i<s.length();i++,ch2=' ')
		{
			char ch=s.charAt(i);
			if (i<s.length()-1)
				ch2=s.charAt(i+1);
			System.out.print("");
			if (ch>='0' && ch<='9')
			{
				num+=ch;
				if (!(ch2>='0' && ch2<='9') || ch2==' ')
				{
					a=true;
				}
			}
			else
			{
				ss+=ch;
				if (ch2>='0' && ch2<='9')
				{
					b=true;
				}
			}
			System.out.print("");
			if (a && b)
			{
				int n=Integer.parseInt(num);
				for (int j=0;j<n;j++ )
				{
					System.out.print(ss);
				}
				ss="";
				num="";
				a=false;
				b=false;
			}

		}
		
	}
}
