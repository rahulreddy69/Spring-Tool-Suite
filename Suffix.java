package p1;

import java.util.Scanner;

public class Suffix {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		String suf;
 		if(date % 10 == 1)
		{
			suf = "st";
		}
 		else if(date % 10 == 2)
 			suf = "nd";
 		else if(date % 10 == 3)
 			suf = "rd";
 		else
 			suf = "th";
 		System.out.print(date+suf);
	}

}
