class Parent10{
	static int x = 10;
	static void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child10 extends Parent10{
	static void fun(){
		
		System.out.println("In fun-Child10");
	}
}
class Client10{
	public static void main(String [] args){
		Parent10 obj1 = new Parent10();
		obj1.fun();
		System.out.println(obj1.x);

		Child10 obj2 = new Child10();
		obj2.fun();
		System.out.println(obj2.x);

		Parent10 obj3 = new Child10();
		obj3.fun();
		System.out.println(obj3.x);

	}
}


