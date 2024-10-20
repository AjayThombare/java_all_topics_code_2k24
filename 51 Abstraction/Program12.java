abstract class Parent12{
	void career(){
		System.out.println("Software engg");
	}
	abstract void marry();
}
class Child12 extends Parent12{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client12{
	public static void main(String [] args){
		Parent12 obj = new Parent12();
		Child12 obj1 = new Child12();
	}
}


