interface Demo27{
	void m1();
}
class Outer27{
	public static void main(String [] args){
		Demo27 obj = () ->{
			System.out.println("Anonymous Class");
		};
		obj.m1();
	}
}

