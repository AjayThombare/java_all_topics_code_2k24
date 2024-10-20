class Parent29{
}
class Child29 extends Parent29{
}
class Demo29{
	void fun(Child obj){
		System.out.println("In fun");
	}
}
class Outer29{
	public static void main(String [] args){
		Demo29 obj = new Demo29();
		obj.fun();
	}
}

