class Demo3{
	void fun(){
		System.out.println("In fun");
	}
	static void run(){
		System.out.println("In run");
	}
	public static void main(String [] args){
		Demo3 obj = new Demo3();
		obj.fun();
		obj.run();
	}
}

