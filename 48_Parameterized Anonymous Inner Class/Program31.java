class Parent31{
}
class Child31 extends Parent31{
}
class Demo31{
	void fun(Child31 obj){
		System.out.println("In fun");
	}
}
class Outer31{
	public static void main(String [] args){
		Demo31 obj = new Demo31();
		obj.fun(new Parent31());
		obj.fun(new Child31());
	}
}


