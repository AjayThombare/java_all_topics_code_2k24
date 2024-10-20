class Parent12{
	void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent12{
	void run(){
		System.out.println("In run-Child");
	}
	public static void main(String [] arrgs){
		Parent obj1 = new Parent();
		obj1.fun();
		obj1.run();
		Child obj2 = new Child();
		obj2.fun();
		obj2.run();
	}
}


