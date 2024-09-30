class DemoOne17{
	private int x = 10;
	int y = 20;
	private void fun(){
		System.out.println("In fun");
	}
	void run(){
		System.out.println("In run");
	}
	public static void main(String [] args){
		DemoOne17 obj = new DemoOne17();

		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}



