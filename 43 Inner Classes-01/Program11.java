class Parent{
	void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent{
	void run(){
		System.out.println("in fuun - Child");
	}
	public static void main(String [] args){
		Parent obj1 = new Parent();
		obj1.fun();
		Child obj2 = new Child();
		obj2.fun();
		obj2.run();
	}
}

