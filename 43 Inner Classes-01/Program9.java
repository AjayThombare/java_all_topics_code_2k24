class Parent{
	void fun(){
		System.out.println("in fun - Parent");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("in fun - Chld");
		super.fun();
	}
	public static void main(String [] args){
		Child obj = new Child();
		obj.fun();
	}
}

