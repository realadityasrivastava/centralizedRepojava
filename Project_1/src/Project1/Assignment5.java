package Project1;

public class Assignment5 {
public void m1 (){
	this.m4(10, 15, 20);
	System.out.println("Defult method");
	this.m3(5, 10);
	this.m2(25);
	this.m5(20, 25, 30, 40);
}

public void m2 (int a) {
	System.out.println("one parameterized method");
}

public void m3 (int a, int b) {
	System.out.println("Two parameterized method");
}

public void m4 (int a, int b, int c) {
	System.out.println("Three parameterized method");
}

public void m5 (int a, int b, int c, int d) {
	System.out.println("Four parameterized method");
}

public static void main(String[] args) {
	Assignment5 call= new Assignment5();
	call.m1();
}
}
