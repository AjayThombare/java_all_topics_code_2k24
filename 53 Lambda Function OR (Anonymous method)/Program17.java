class Demo17{
	void m1(){
		System.out.println("In m1-Demo17");
	}
}
class Outer17{
	public static void main(String [] args){
		Demo17 obj = new Demo17(){
			void m1(){
				System.out.println("In m1-Outer$1");
			}
		};
		obj.m1();
	}
}

