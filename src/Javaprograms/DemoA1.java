package Javaprograms;
class A{
	void m1() {
		System.out.println("hi");
	}
	void m2() {
		System.out.println("hello");
	}
}
class B extends A
{
	void m3() {
		System.out.println("bye");
	}
}
public class DemoA1 {

	public static void main(String[] args) {
		A a1=new B();
		//upcasting
		B b1=(B)a1;
		b1.m1();
		b1.m2();
		b1.m3();
		
		

	}

}
