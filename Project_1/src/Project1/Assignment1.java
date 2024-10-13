package Project1;

public class Assignment1 {
	    int age;
	    int rollno;
	    public static void display1() {
	        System.out.println("Welcome to all of you");
	    }
	    public static void display2() {
	        System.out.println("Automation is very easy");
	    }
	    public static void main(String[] args) {
	        Assignment1 deepak = new Assignment1();
	        deepak.display1();
	        deepak.display2();
	        deepak.age = 15;
	        deepak.rollno = 25;
	        System.out.println("Student age is " + deepak.age);
	        System.out.println("Student roll No. is " + deepak.rollno);

	        Assignment1 hari = new Assignment1();
	        hari.display1();
	        hari.display2();
	        hari.age = 16;
	        hari.rollno = 26;
	        System.out.println("Student age is " + hari.age);
	        System.out.println("Student roll No. is " + hari.rollno);
	    }
	}
