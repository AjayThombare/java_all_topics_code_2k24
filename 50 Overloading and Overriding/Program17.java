class Demo17{
	static int x = 10;
	int y = 20;
	Demo17(){
		//super();
		System.out.println("In Constructor");
	}
	static {
		//x = 10;
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	void fun(){
		System.out.println("In non static method");
	}
	static void run(){
		System.out.println("In static method");
	}
	public static void main(String [] args){
		System.out.println("In main");
		run();
	}
}

