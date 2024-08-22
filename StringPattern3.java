/* StringPattern3

Enter the n value: 7
*     *
**   **
* * * *
*  *  *
* * * *
**   **
*     *

*/
import java.util.*;
class StringPattern3 
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value: ");
		int row=sc.nextInt();
		int i=1,j=row;
		int count=0;
		boolean b=true;
		while(count<row)
		{
			int m=1,n=row;
			for (int k=1;k<=row ;k++ )
			{
				if (k==m || k==n)
				{
					System.out.print("*");
				}
				else if ( k==i || k==j  )
				{
					System.out.print("*");
					if (i==j)
					{
						b=false;
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			if (b)
			{
				i++;
				j--;
			}
			else
			{
				i--;
				j++;
			}
			count++;
		}
	}
}
