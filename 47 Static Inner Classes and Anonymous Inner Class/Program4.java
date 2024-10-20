class Outer{
	static int x = 10;
	int y = 20;
	static void run(){
		System.out.println("In static method");
	}
	void fun(){
		System.out.println("In non-static method");
	}
	public static void main(String [] args){
		System.out.println(x);
		System.out.println(y);
		run();
		fun();
	}
}


