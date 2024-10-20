class Parent8{
	void fun(){
		System.out.println("In fun - Parent");
	}
}
class Child extends Parent8{
	void fun(){
		System.out.println("In fun - Child");
	}
	public static void main(String [] args){
		Child obj = new Child();
		obj.super.fun();
	}
}

