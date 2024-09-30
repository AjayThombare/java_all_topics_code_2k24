class DemoOne16{
	private int x = 10;
	int y = 20;
	private void fun(){
		System.out.println("In fun");
	}
	void run(){
		System.out.println("In run");
	}
}
class DemoTwo{
	public static void main(String [] args){
		DemoOne16 obj = new DemoOne16();

		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}



