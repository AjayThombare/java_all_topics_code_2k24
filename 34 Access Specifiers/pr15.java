class DemoOne15{
	int x = 10;
	int y = 20;
	void fun(){
		System.out.println("In fun");
	}
	void run(){
		System.out.println("In run");
	}
}
class DemoTwo{
	public static void main(String [] args){
		DemoOne15 obj = new DemoOne15();

		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}



