class DemoOne19{
	private int x = 10;
	int y = 20;
	private void fun(){
		System.out.println("In fun");
	}
	void run(){
		int c = 80;
		System.out.println("In run");
	}
	public static void main(String [] args){
		DemoOne19 obj = new DemoOne19();
		System.out.println(x);
		System.out.println(y);
		fun();
		run();
	}
}

