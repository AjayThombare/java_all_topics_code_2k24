class Parent{
	void fun(){
		System.out.println("IIn fun-Parent");
	}
}
class Child extends Parent{
	void run(){
		System.out.println("In fun-Child");
	}
	public static void main(String [] args){
		Child obj = new Child();
		obj.fun();
		obj.run();
	}
}

