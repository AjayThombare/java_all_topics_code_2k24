abstract class Demo15{
	void m1();
}
class Outer15{
	public static void main(String [] args){
		Demo15 obj = new Demo15(){
			void m1(){
				System.out.println("In m1-Outer$1");
			}
		};
	}
}

