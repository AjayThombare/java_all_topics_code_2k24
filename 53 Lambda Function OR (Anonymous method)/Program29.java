interface Demo29{
	void m1();
	default void m2(){
	}
}
class Outer29{
	public static void main(String [] args){
		Demo29 obj = ()->{
			System.out.println("Anonymous Class");
		};
		obj.m1();
	}
}

