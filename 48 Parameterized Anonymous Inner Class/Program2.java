class Demo{
	void fun(){
		System.out.println("In fun");
	}
}
class DemoChild extends Demo{
	void fun(){
		System.out.println("In fun DemoChild");
	}
	void run(){
		System.out.println("In run DemoChild");
	}
}
class Outer{
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun();
		obj.run();
		DemoChild obj2 = new DemoChild();
		obj2.fun();
		obj2.run();
		DemoChild obj3 = new DemoChild();
		obj3.fun();
		obj3.run();
	}
}

