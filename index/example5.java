class example5
{
	public static void main(String args[])
	{
		String s1=new String("COMPUTER");
		String s2=new String("COMPUTER");
		int i=s1.compareTo(s2);
		if(i==0)
			System.out.print("Yes...");
		else
			System.out.println("No....");
	}
}