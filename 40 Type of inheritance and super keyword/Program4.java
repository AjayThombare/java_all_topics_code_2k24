class Parent{
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
		System.out.println("Child Constructor");
	}
	public static void main(String [] args){
		Child obj = new Child();
		System.out.println(obj.x);
		obj.fun();
	}
}

