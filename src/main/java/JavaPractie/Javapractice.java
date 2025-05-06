package JavaPractie;

import java.util.Scanner;

public class Javapractice {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day name like Sunday, Moday Tuesday, WednesDay, Thursday, Friday and Saturday");
		String x=sc.nextLine();
		
		if(x.equalsIgnoreCase("saturday") | x.equalsIgnoreCase("sunday"))
		{
			System.out.println("Holoday");
		}
		else
		{
			System.out.println("Working Day");
		}
		sc.close();

	}

}
