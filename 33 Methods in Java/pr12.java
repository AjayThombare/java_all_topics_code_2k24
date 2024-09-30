class Demo12{
	int x = 10;
	static int y = 20;
	void fun(){
		System.out.println("In fun method");
	}
	static void run(){
		System.out.println("In run method");
	}
	public static void main(String []args){
		System.out.println("In main method");
		System.out.println(x);
		System.out.println(y);
		fun();
		run();
	}
}


