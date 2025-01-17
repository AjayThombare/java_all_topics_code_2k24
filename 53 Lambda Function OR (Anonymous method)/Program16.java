abstract class Demo16{
	abstract void m1();
}
class Outer16{
	public static void main(String [] args){
		Demo16 obj = new Demo16(){
			void m1(){
				System.out.println("In m1-Outer&1");
			}
		};
	}
}

