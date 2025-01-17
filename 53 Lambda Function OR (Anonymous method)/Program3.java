interface Demo3{
	void m1();
	void m2();
}
abstract class DemoChild3 implements Demo3{
	public void m1(){

	}
	public void m2(){

	}
}
class Client3{
	public static void main(String [] args){
		DemoChild3 obj = new DemoChild3();
	}
}

