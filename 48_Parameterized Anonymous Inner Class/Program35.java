class Parent35{
}
class Child35 extends Parent35{
}
class Demo35{
	void fun(Parent35 obj){
		System.out.println("In fun-Parent35");
	}
	void fun(){
		System.out.println("In fun-Child35");
	}
}
class Outer35{
	public static void main(String [] args){
		Demo35 obj = new Demo35();
		obj.fun(new Parent35());
		obj.fun(new Child35());
	}
}

