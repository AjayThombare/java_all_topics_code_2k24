class Parent36{
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child36 extends Parent36{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Demo36{
	void fun(Parent36 obj){
		obj.marry();
	}
}
class Outer36{
	public static void main(String [] args){
		Demo36 obj = new Demo36();
		obj.fun(new Parent36());
		obj.fun(new Child36());
	}
}

