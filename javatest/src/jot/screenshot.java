package jot;

public class screenshot 
{
    static int i; 
	
	public static void main(String[] args)
	{
		screenshot ss = new screenshot(i);
   	}
	screenshot(int i)
	{
		System.out.println("constructor   : - " +   getClass().getSimpleName());
		System.out.println(i);
	}
}
