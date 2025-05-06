package JavaPractie;

import java.util.Scanner;

public class ReveseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String x=sc.nextLine();
		sc.close();
		
		String reverseword=" ";
		
		for (int i=x.length()-1;i>=0;i--)
		{
			reverseword +=x.charAt(i);
		}
		System.out.println("Reversed Word is :-" +reverseword);
	}

}
