interface Demo21{
	void m1();
}
class Outer21{
	public static void main(String [] args){
		Demo21 obj = m1() ->{
			System.out.println("In m1-Outer$1");
		};
		obj.m1();
	}
}

