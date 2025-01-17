interface Demo25{
	void m1();
}
class Outer25{
	public static void main(String [] args){
		Demo25 obj = () -> {
			System.out.println("In m1-Outer$1");
		};
		obj.m1();
	}
}

