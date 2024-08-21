/* String Pattern2
Write a program to create a this pattern.assume the length of the string is odd
Enter the String: PROGRAM
             G
           GR
         GRA
      GRAM
    GRAMP
  GRAMPR
GRAMPRO
*/
import java.util.*;
class StringPattern2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		int len=s.length()*2;
		int mid=(s.length())/2;
		for (int i=1;i<=s.length();i++ )
		{
			for (int j=1;j<len;j++ )
			{
				System.out.print(" ");
			}
			if (i%3==0)
				len--;
			len-=2;
			for (int j=mid,n=0,m=0;m<i;m++,j++)
			{
				if (j<s.length())
					System.out.print(s.charAt(j));
				else if (j>s.length()-1)
				{
					System.out.print(s.charAt(n++));
				}
			}
			System.out.println();
			
				
		}
	}
}
