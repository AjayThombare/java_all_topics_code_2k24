interface Demo19{
	void m1();
}
class Outer19{
	public static void main(String [] args){
		Demo19 obj = m1() ->{System.out.println("In m1-Outer$1");}
		obj.m1();
	}
}

