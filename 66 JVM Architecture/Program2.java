class Demo{
	int x = 10;
	static int y = 20;
	static {
		System.out.println("In static-block");
	}
	void fun(){
		System.out.println("in non-static method");
	}
	static void run(){
		System.out.println("In static method");
	}
}
class DemoChild{
	DemoChild(){
		System.out.println("in constructor DemoChild");
	}
}
class Client2{

	public static void main(String [] aef){

	}
}

