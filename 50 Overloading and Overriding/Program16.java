class Demo16{
	static int x = 10;
	Demo16(){
		//super();
		//y = 20;
		System.out.println("In constructor");
	}
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}
	static {
		System.out.println("Static block3");
	}
	static void run(){
		System.out.println("In static method");
	}
	public static void main(String [] args){
		System.out.println("In main");
		run();
	}
}



