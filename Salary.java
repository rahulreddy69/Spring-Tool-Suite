package p1;

import java.util.Scanner;
public class Salary {
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 double basic = sc.nextDouble();
		 double HRA = 0.4 * basic;
		 double DA = 0.6 * (basic + HRA);
		 double tax;
		 System.out.println("Basic Salary is "+basic);
		 System.out.println("HRA is "+HRA);
		 System.out.println("DA is "+DA);
		 if((basic + HRA + DA) < 200000)
			 tax = 0.0;
		 else if((basic + HRA + DA) >= 200000 && (basic + HRA + DA) < 600000)
			 tax = 0.1 * (basic + HRA + DA);
		 else
			 tax = 0.2 * (basic + HRA + DA);
		 System.out.println("Tax is "+tax);
	 }
}
