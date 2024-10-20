class Outer5{
	static int x = 10;
	int y = 20;
	static void run(){
		System.out.println("In static method");
	}
	void fun(){
		System.out.println("In non-static method");
	}
	public static void main(String [] args){
		Outer5 obj = new Outer5();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.run();
		obj.fun();
	}
}



