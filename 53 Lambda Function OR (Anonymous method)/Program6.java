interface Demo6{
	void m1(){
		System.out.println("In m1 method");
	}
	void m2();
}
class DemoChild implements Demo6{
	public void m2(){
		System.out.println("In m2-DemoChild");
	}
}
class DemoChild1 implements Demo6{
	public void m2(){
		System.out.println("In m2-DemoChild1");
	}
}
class DemoChild implements Demo6{
	public void m2(){
		System.out.println("In m2-DemoChild2");
	}
}
class Client6{
	public static void main(String [] args){
		Demo6 obj = new DemoChild();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}

