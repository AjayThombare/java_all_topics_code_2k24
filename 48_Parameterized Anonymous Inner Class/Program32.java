class Parent32{
}
class Child32 extends Parent32{
}
class Demo32{
	void fun(Child32 obj){
		System.out.println("In fun");
	}
}
class Outer32{
	public static void main(String [] args){
		Demo32 obj = new Demo32();
		obj.fun(new Child32());
	}
}

