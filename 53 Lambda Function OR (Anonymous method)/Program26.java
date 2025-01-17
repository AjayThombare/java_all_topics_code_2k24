interface Demo26{
	void m1();
}
class Outer26{
	public static void main(String [] args){
		Demo26 obj = new Demo26(){
			public void m1(){
				System.out.println("Anonymous Class");
			}
		};
		obj.m1();
	}
}

