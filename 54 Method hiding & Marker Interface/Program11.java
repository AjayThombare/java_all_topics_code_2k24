class Parent11{
	static int x = 10;
	static void fun(){
		System.out.println("In fun-Parent11");
	}
}
class Child11 extends Parent11{
	static int x  = 20; 
	static void fun(){
		System.out.println("In fun-Child11");
	}
}
class Client11{
	public static void main(String [] args){
		Parent11 obj1 = new Parent11();
		obj1.fun();
		System.out.println(obj1.x);

		Child11 obj2 = new Child11();
		obj2.fun();
		System.out.println(obj2.x);

		Parent11 obj3 = new Parent11();
		obj3.fun();
		System.out.println(obj3.x);
	}
}



