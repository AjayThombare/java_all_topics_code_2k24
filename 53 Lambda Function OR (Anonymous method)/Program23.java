interface Demo23{
	void m1();
}
class Outer23{
	public static void main(String [] args){
		Demo23 obj = m1() { System.out.println("In m1-Outer$1");
		}
		obj.m1();
	}
}

