class Demo5{
	void fun(){
		System.out.println("In fun-Demo");
	}
}
class DemoChild5 extends Demo5{
	void fun(){
		System.out.println("In fun DemoChild");
	}
	void run(){
		System.out.println("In run DemoChild");
	}
}
class Outer5{
	public static void main(String [] argss){
		Demo obj = new DemoChild(){
		};
		obj.fun();
	}
}

