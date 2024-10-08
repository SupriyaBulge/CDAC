/*class recursion1
{
	static void show()
	{
		System.out.println("Hi Girls");
		show();
	}
	public static void main(String args[])
	{
		show();
	}
}*/
//it will go in infinite loop

class recursion1
{
	static int i=0;
	static void show()
	{
		++i;
		if(i<=5)
		{
		System.out.println("Hi Girls");
		show();
		}
	}
	public static void main(String args[])
	{
		show();
	}
}