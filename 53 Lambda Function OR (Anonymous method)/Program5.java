interface Demo5{
	void m1();
	void m2();
}
class DemoChild5 implements Demo5{
	public void m1(){
	}
	public void m2(){
	}
	void m3(){
	}
}
class Client5{
	public static void main(String [] args){
		Demo5 obj = new DemoChild5();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}


