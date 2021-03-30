package p1;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int English = sc.nextInt();
		int Java = sc.nextInt();
		int DB = sc.nextInt();
		int Spring = sc.nextInt();
		int marks = English + Java + DB + Spring;
		System.out.println("Total marks obtained: "+marks);
		System.out.println("Average marks obtained: "+(marks/4));
	}
}
