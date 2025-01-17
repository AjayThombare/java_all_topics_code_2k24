interface Demo18{
	void m1();
}
class Outer18{
	public static void main(String [] args){
		Demo18 obj = new Demo18(){
			public void m1(){
				System.out.println("In m1-Outer$1");
			}
		};
		obj.m1();
	}
}

