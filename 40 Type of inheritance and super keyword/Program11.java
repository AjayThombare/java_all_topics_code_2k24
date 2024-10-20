class Parent {
	int x = 10;
	Parent(){
		System.out.println("Parent constructor");
	}
	void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent{
	int x = 20;
	Child(){
		super();
		super();
		System.out.println("Child Constructor");
		System.out.println(x);
		System.out.println(super.x);
	}
	void fun(){
		System.out.println("In fun-Child");
		super.fun();
	}
	public static void main(String [] args){
		Child obj = new Child();
		obj.fun();
	}
}


