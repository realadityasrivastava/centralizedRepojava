package Project1;

public class Assignment4 {

public Assignment4() {
	this (1,2,3);
	System.out.println("Default constructor"); //2
}
public Assignment4(int a) {
	this (1,2);
	System.out.println("one parameterized constructor"); //4
}
public Assignment4(int a, int b) {
	this ();
	System.out.println("two parameterized constructor"); //3
}
public Assignment4(int a, int b, int c) {
	System.out.println("three parameterized constructor"); //1
}
public static void main(String[] args) {
	Assignment4 aditya=new Assignment4(21);
}
}