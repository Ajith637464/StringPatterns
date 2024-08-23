import java.util.*;
class Adhaar
{
	static Scanner sc=new Scanner(System.in);
	private String name;
	private long contact;
	private String loc;
	private int age;
	
	public Adhaar(){}
	public Adhaar(String name,long contact,String loc,int age)
	{
		this.name=name;
		this.contact=contact;
		this.loc=loc;
		this.age=age;
	}
	public String getName()
	{	return name;}
	public long getContact()
	{	return contact;	}
	public String getLocation()
	{	return loc;}
	public int getAge()
	{	return age;}

	public void setName(String name) throws Exception
	{	
		if (verification())
		{
			this.name=name;
			System.out.println("\t\t\t\t\t<<<     Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t******Modification of name done successfully****** :)");
		}
		else
		{
			System.out.println("\t\t\t\t\t<<<     Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t*****Can't modify the name. Verification failed****** :(");
			Thread.sleep(2000);
		}
	}
	public void setContact(long contact) throws Exception
	{	
		if (verification())
		{
			this.contact=contact;
			System.out.println("\t\t\t\t\t<<<     Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t*****Modification of contact done successfully****** :)");
		}
		else
		{
			System.out.println("\t\t\t\t\t<<<     Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t******Can't modify the contact. Verification failed****** :(");
			Thread.sleep(2000);
		}
	}
	public void setLocation(String loc) throws Exception
	{
		if (verification())
		{
			this.loc=loc;
			System.out.println("\t\t\t\t\t<<<     Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t******Modification of location done successfully****** :)");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("\t\t\t\t\t<<<     Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t******Can't modify the location. Verification failed****** :(");
			Thread.sleep(2000);}
	}
	public void setAge(int age)throws Exception
	{	
		if (verification())
		{
			this.age=age;
			System.out.println("\t\t\t\t\t<<<    Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t******Modification of age done successfully****** :)");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("\t\t\t\t\t<<<    Processing     >>>");
			Thread.sleep(2000);
			System.out.println("\t\t\t******Can't modify the age.Verification failed****** :(");
			Thread.sleep(2000);
			}
	}
	public boolean verification()throws Exception
	{
		System.out.print("Enter your Contact mentioned in adhaar: ");
		long user_entered_contact=sc.nextLong();
		if (contact==user_entered_contact)
		{
			int sys_otp=(int)(Math.random()*9999+9999);
			System.out.print("OTP: ");
			Thread.sleep(2000);
			System.out.print(sys_otp);
			System.out.println("\nEnter the otp send in your mob: ");
			int user_entered_otp=sc.nextInt();
			if (user_entered_otp==sys_otp)
			{
				return true;
			}
		}
		return false;
	}
}




import java.util.Scanner;
class User 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		Adhaar card1=new Adhaar("Ajith",1234567890,"Chennai",23);
		System.out.println("\t\t\t***Welcome to Adhaar portal***");
		boolean flag=true;
		do
		{
			display();
			int info=sc.nextInt();
			switch(info)
			{
				case 1:
				{
					System.out.println("\t\t\tRedirecting to get information page");
					Thread.sleep(2000);
					boolean flag2=true;
					do
					{
						display2();
						int get_info=sc.nextInt();
						switch(get_info)
						{
							case 1:
							{
								System.out.println("\t\t\t\t\t<<<    Processing     >>>");
								Thread.sleep(2000);
								System.out.println("\t\t\t\t\tName: "+card1.getName());
								Thread.sleep(2000);
								break;
							}
							case 2:
							{
								System.out.println("\t\t\t\t\t<<<     Processing     >>>");
								Thread.sleep(2000);
								System.out.println("\t\t\t\t\tContact: "+card1.getContact());
								Thread.sleep(2000);
								break;
							}
							case 3:
							{
								System.out.println("\t\t\t\t\t<<<     Processing     >>>");
								Thread.sleep(2000);
								System.out.println("\t\t\t\t\tLocation: "+card1.getLocation());
								Thread.sleep(2000);
								break;
							}
							case 4:
							{
								System.out.println("\t\t\t\t\t<<<     Processing     >>>");
								Thread.sleep(2000);
								System.out.println("\t\t\t\t\tAge: "+card1.getAge());
								Thread.sleep(2000);
								break;
							}
							case 5:
							{
								flag2=false;
								System.out.println("\t\t\tRedirecting to Home page");
								Thread.sleep(2000);
							}
						}
					}
					while(flag2);
					break;
				}
				case 2:
				{
					System.out.println("\t\t\tRedirecting to Set information page");
					Thread.sleep(2000);
					boolean flag3=true;
					do
					{
						display3();
						int set_info=sc.nextInt();
						switch(set_info)
						{
							case 1:
							{
								System.out.print("Enter your new name: ");
								card1.setName(sc.next());
								break;
							}
							case 2:
							{
								System.out.print("Enter your new Contact: ");
								card1.setContact(sc.nextLong());
								break;
							}
							case 3:
							{
								System.out.print("Enter your new Location: ");
								card1.setLocation(sc.next());
								break;
							}
							case 4:
							{
								System.out.print("Enter your new Age: ");
								card1.setAge(sc.nextInt());
								break;
							}
							case 5:
							{
								flag3=false;
								System.out.println("\t\t\tRedirecting to Home page");
								Thread.sleep(2000);
							}
						}
					}
					while(flag3);
					break;
				}
				case 3:
				{
					flag=false;
					System.out.println("\t\t\t***** Thanks for using Adhaar Portal *****  :)");
				}
			}
		}
		while (flag);
	}
	public static void display()
	{
		System.out.println("\t\t\t\t---Home Page---");
		System.out.println("1.Get info\n2.Set info\n3.Exit");
		System.out.print("\nSelect the Input: ");
	}
	public static void display2()
	{
		System.out.println("\t\t\t\t---Get Information Page---");
		System.out.println("1.Name\n2.Contact\n3.Location\n4.Age\n5.Exit");
		System.out.print("\nSelect the Input: ");
	}
	public static void display3()
	{
		System.out.println("\t\t\t\t---Set Information Page---");
		System.out.println("1.Name\n2.Contact\n3.Location\n4.Age\n5.Exit");
		System.out.print("\nSelect the Input: ");
	}
}
