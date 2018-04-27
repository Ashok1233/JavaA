package Javaprograms;
class Animal{
	void  eat() {
		System.out.println("eating");
	}
	void sleep() {
		System.out.println("sleeping");
	}
	void bark1() {
		System.out.println("bow bow");
	}
	void wagtail1() {
		System.out.println("wagging tail");
	}
	
}
class Dog extends Animal
{
	void bark() {
		System.out.println("bow bow");
	}
	void wagtail() {
		System.out.println("wagging tail");
	}
	
	
}
public class DemoA {

	public static void main(String[] args) {
		Animal d1=new Dog(); //upcasting
	    Dog d=(Dog)d1;
	
		d.eat();
		d.bark1();
		d.wagtail1();
        d.sleep();
        d.bark();
	  

	}

}
