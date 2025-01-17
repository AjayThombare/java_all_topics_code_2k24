interface Demo31{
	void m1(int x, int y);
}
class Outer31{
	public static void main(String [] args){
		Demo31 obj = (int x, int y)->{
			System.out.println("Anonymous Class");
			System.out.println(x+y);
		};
		obj.m1(10,20);
	}
}

