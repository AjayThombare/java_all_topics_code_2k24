class Parent34{
}
class Child34 extends Parent34{
}
class Demo34{
	void fun(Parent34 obj){
		System.out.println("In fun-Parent34");
	}
	void fun(Child34 obj){
		System.out.println("In fun-Child34");
	}
}
class Outer34{
	public static void main(String [] args){
		Demo34 obj = new Demo34();
		obj.fun(new Parent34());
		obj.fun(new Child34());
	}
}


