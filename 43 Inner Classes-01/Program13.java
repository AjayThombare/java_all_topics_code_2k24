class Parent{
	void fun(){
		System.out.println("In fun-Pparent");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("in fun- Child");
	}
	void run(){
		System.out.println("in run- Child");
	}
	public static void main(String [] args){
		Parent obj = new Parent();
		obj.fun();
	}
}



			
