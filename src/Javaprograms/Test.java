package Javaprograms;
class Animal1{
	String color="wite";
	Animal1(int i) {
		System.out.println("eating:"+ i);
	}
	void m1() {
		System.out.println("hi");
	}
}
class Dog1 extends Animal1{
	Dog1(int j){
		super(1);
		super.m1();
		System.out.println(super.color);
	
		System.out.println("barking:"+ j);
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		Dog1 d=new Dog1(20);
	
		

	}

}
