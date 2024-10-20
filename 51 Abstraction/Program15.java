abstract class Parent15{
	void career(){
		System.out.println("Software engg");
	}
	public abstract void marry();
}
class Child15 extends Parent15{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client15{
	public static void main(String [] args){
		Parent15 obj = new Child15();
		obj.career();
		obj.marry();
	}
}

