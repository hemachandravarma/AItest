package JavaPractie;

import java.util.Scanner;

public class ReverseStringlastword {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Emnter a string");
		String x=sc.nextLine();
		sc.close();
		
		String[] words=x.split(" ");
		String lastword=words[words.length-1];
		
		char[] chars=lastword.toCharArray();
		String reverselastword ="";
		
		for (int i=chars.length-1;i>=0;i--)
		{
			reverselastword += chars[i];
		}
		
		words[words.length-1]=reverselastword;
		String result=String.join(" ", words);
		
		System.out.println(result);

	}

}
