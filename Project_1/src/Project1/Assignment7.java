package Project1;

import java.util.Scanner;

public class Assignment7 {
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

public int div(int div1, int div2) {
        int div3;
        div3 = div1/div2;
        System.out.println("The Final Result = " +div3);
		return div3;
}

public static void main(String[] args) {
	//   (((((a+b)-c)+d)*e)/f)
	System.out.println("Enter the two number (a+b)");
	Scanner scan = new Scanner(System.in);
	Assignment7 print=new Assignment7();
	int a=scan.nextInt();
	int b=scan.nextInt();
	int sumresult = print.sum(a, b);
	System.out.println("Enter the number for subtraction = ((a+b)-c)");
	int c=scan.nextInt();
	int subresult = print.sub(sumresult, c);
	System.out.println("Enter the number for additon (((a+b)-c)+d)");
	int d=scan.nextInt();
	int subresult2 = print.sum(subresult, d);
	System.out.println("Enter the number for multiplication ((((a+b)-c)+d)*e)");
	int e=scan.nextInt();
	int multiresult = print.multi(subresult2, e);
	System.out.println("Enter the number for division (((((a+b)-c)+d)*e)/f)");
	int f=scan.nextInt();
	float divresult=print.div(multiresult, f);
	System.out.println("Final reult is (((((a+b)-c)+d)*e)/f) = " +divresult);
    scan.close();
}
}
