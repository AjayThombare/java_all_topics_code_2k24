interface Demo22{
	void m1();
}
class Outer22{
	public static void main(String [] args){
		Demo22 obj = m1() -> System.out.println("In m1-Outer$1");
		obj.m1();
	}
}

