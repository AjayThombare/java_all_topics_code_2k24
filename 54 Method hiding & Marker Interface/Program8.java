class Parent8{
	static void fun(){
		System.out.println("In fun-Parnet");
	}
}
class Child8 extends Parent8{
	static void fun(){
		System.out.println("In fun-Child8");
	}
}
class Client8{
	public static void main(String [] args){
		Parent8 obj = new Parent8();
		obj.fun();

		Child8 obj2 = new Child8();
		obj2.fun();
	}
}

