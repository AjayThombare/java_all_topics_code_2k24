class Parent9{
	static void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child9 extends Parent9{
	static void fun(){
		System.out.println("In fun-Child9");
	}
}
class Client9{
	public static void main(String [] args){
		Parent9 obj = new Parent9();
		obj.fun();

		Child9 obj2 = new Child9();
		obj2.fun();

		Parent9 obj3 = new Child9();
		obj3.fun();
	}
}

