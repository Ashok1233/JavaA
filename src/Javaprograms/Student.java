package Javaprograms;

public class Student {
	int i;
	String name;
	Student(int i,String name){
		this.i=i;
		this.name=name;
		System.out.println("Student roll no:"+ i +" "+ " Student name is:"+ name);
		
		
	}

	public static void main(String[] args) {
		Student s=new Student (1,"Ashok");
		Student s1=new Student (2,"Akash");
		
		

	}

}
