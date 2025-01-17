interface Demo30{
	void m1();
	static void m2(){

	}
}
class Outer30{
	public static void main(String [] args){
		Demo30 obj = ()->{
			System.out.println("Anonymous Class");
		};
		obj.m1();
	}
}

