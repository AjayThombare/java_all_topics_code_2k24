class Parent{
	void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("In fun-Child");
	}
}
class Client18{
	public static void main(String [] args){
		Parent obj = new Child();
		obj.fun();
	}
}

