interface Demo28{
	void m1();
	void m2();
}
class Outer28{
	public static void main(String[] args){
		Demo28 obj = ()->{
			System.out.println("Anonymous Class");
		};
		obj.m1();
	}
}

