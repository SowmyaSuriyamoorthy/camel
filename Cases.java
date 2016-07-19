package sample;

import java.util.Scanner;

public class Cases
{
private static Scanner s;

public static void main(String[] args) {
	String str=new String();
	System.out.println("enter the string");
	s = new Scanner(System.in);
	str=s.nextLine();
	str.toCharArray();
	int i;
	int leng = 0;
	char ch;
	leng=str.length();
	for(i=0;i<leng;i++)
	{
		ch=str.charAt(i);
		if(Character.isLowerCase(ch))
		{
		System.out.print(Character.toUpperCase(ch));
		}
}
	}
}
	
