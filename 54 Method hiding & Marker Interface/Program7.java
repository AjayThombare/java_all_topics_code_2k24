class Parent7{
	final void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child7 extends Parent7{
	void fun(){
		System.out.println("In fun-Child");
	}
}
class Client7{
	public static void main(String [] args){
		Parent7 obj = new Child7();
		obj.fun();
	}
}

