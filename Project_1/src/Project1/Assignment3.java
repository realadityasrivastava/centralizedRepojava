package Project1;

public class Assignment3 {
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
	
	public void div(int div1, int div2) {
		int div3;
		div3 = div1/div2;
		System.out.println("The Final Result = " +div3);
	}
	
	public static void main(String[] args) {
		Assignment3 res= new Assignment3();
		int multiresult = res.multi(10, 2);
		int subresult = res.sub(multiresult, 2);
		int subresult2 = res.sub(subresult, 2);
		int sumresult = res.sum(subresult2, 2);
		res.div(sumresult, 2);
	}
}