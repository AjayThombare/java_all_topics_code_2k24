class Parent33{
}
class Child33 extends Parent33{
}
class Demo33{
	void fun(Parent33 obj){
		System.out.println("In fun-Parent33");
	}
	void fun(Child33 obj){
		System.out.println("In fun-Child33");
	}
}
class Outer33{
	public static void main(String [] args){
		Demo33 obj = new Demo33();
		obj.fun(new Parent33());
	}
}

