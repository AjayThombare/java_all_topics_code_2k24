class Parent28{

}
class Child28 extends Parent28{
}
class Demo28{
	void fun(Parent28 obj){
		System.out.println("In fun");
	}
}
class Outer28{
	public static void main(String [] args){
		Demo28 obj = new Demo28();
		obj.fun();
	}
}


