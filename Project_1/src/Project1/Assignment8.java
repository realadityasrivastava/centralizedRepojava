package Project1;
	import java.util.Scanner;

	public class Assignment8 {
		public int sum(int sum1,int sum2) {
	        int sum3;
	        sum3 = sum1 + sum2;
	        return sum3;
	}
	public int sub(int sub1,int sub2) {
	        int sub3;
	        sub3 = sub1 - sub2;
	        return sub3;
	}

	public int multi(int multi1,int multi2) {
	        int multi3;
	        multi3 = multi1 * multi2;
	        return multi3;
	}

	public float div(float div1, float div2) {
	        float div3;
	        div3 = div1/div2;
	        System.out.println("The Final Result = " +div3);
			return div3;
	}

	public static void main(String[] args) {
		// (((((a*b)-c)*d)+e)/f)
		System.out.println("Enter the two number (a*b)");
		Scanner scan = new Scanner(System.in);
		Assignment8 print=new Assignment8();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int multiresult = print.multi(a, b);
		System.out.println("Enter the number for subtraction = ((a*b)-c) ");
		int c=scan.nextInt();
		int subresult = print.sub(multiresult, c);
		System.out.println("Enter the number for multiplication (((a*b)-c)*d) ");
		int d=scan.nextInt();
		int multiresult2 = print.multi(subresult, d);
		System.out.println("Enter the number for addition ((((a*b)-c)*d)+e)");
		int e=scan.nextInt();
		int sumresult = print.sum(multiresult2, e);
		System.out.println("Enter the number for division (((((a*b)-c)*d)+e)/f)");
		int f=scan.nextInt();
		float divresult=print.div(sumresult, f);
		System.out.println("Final reult is (((((a+b)-c)+d)*e)/f) = " +divresult);
	    scan.close();
	}
	}