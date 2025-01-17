class Demo {
	int x = 10;
	static int y = 20;
	static {
		System.out.println("In static block");
	}
	void main(){
		System.out.println("Non-static method");
	}
	static void run(){
		System.out.println("Static method");
	}
}
class DemoChild extends Demo{
	DemoChild(){
		System.out.println("In constructor DemoChild");
	}
}
class Client7{
	static {
		System.out.println("In static client");
	}

	public static void main(String [] args){
		System.out.println("In main");
		System.out.println(Demo.y);
		
	}
}

			
	
