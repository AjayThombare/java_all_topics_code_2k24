class Parent {




}
class Child extends Parent{
	void fun(){
		System.out.println("In fun - Child");
	}
	void run(){
		System.out.println("In run - Child");
	}
	public static void main(String [] args){
		Parent obj1 = new Parent();
		obj1.fun();
	}
}

