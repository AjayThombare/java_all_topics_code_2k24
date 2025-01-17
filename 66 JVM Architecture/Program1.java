class Demo{
	int x = 10;
	static int y = 20;
	static {
		System.out.println("In static block");
	}
	void fun(){
		System.out.println("In non-static method");
	}
	void run(){
		System.out.println("In static method");
	}
}
class DemoChild{
	DemoChild(){
		System.out.println("In constructor DemoChild");
	}
}
class Client1{
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun();
		obj.run();
		DemoChild obj2 = new DemoChild();
	}
}

