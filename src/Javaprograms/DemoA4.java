package Javaprograms;

public class DemoA4 {
	int i;
	String name;
	private DemoA4(int i,String name){
		i=i;
		name=name;
		System.out.println(i+" "+name);
		
	}

	public static void main(String[] args) {
		DemoA4 d=new DemoA4(0,"A");
	

	}

}
