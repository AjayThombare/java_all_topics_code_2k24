class Demo15{
	static int x = 10;
	Demo15(){
		//super();
		//y = 20;
		System.out.println("In constructor");
	}
	static {
		System.out.println("Ststic block");
		System.out.println(x);
	}
	static void run(){
		System.out.println("In static method");
	}
	public static void main(String [] args){
		System.out.println("In main");
		run();

	}
}

