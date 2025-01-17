interface Demo4{
	void m1();
	void m2();
}
class DemoChild4 implements Demo4{
	public void m1(){

	}
	public void m2(){

	}
	void m3(){
	}
}
class Client4{
	public static void main(String [] args){
		Demo4 obj = new DemoChild4();
		obj.m1();
		obj.m2();
	}
}

