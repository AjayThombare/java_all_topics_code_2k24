abstract class Parent13{
	void career(){
		System.out.println("String [] engg");
	}
	abstract void marry();
}
abstract class Child13 extends Parent13{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client13{
	public static void main(String [] args){
		Parent13 obj = new Parent13();
		Child13 obj1 = new Child13();
	}
}

