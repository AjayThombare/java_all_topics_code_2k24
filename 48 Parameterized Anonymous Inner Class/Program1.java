class Demo{
	void fun(){
		System.out.println("In fun");
	}
}
class DemoChild{
	void fun(){
		System.out.println("In fun DemoChild");
	}
}
class Outer{
	public static void main(String [] args){
		Demo obj1 = new Demo();
		obj1.fun();
		DemoChild obj2 = new DemoChild();
		obj2.fun();
		Demo obj3 = new Demo();
		obj3.fun();
	}
}

