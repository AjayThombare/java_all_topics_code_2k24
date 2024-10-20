abstract class Parent14{
	void career(){
		System.out.println("Software engg");
	}
	abstract void marry();
}
class Child14 extends Parent14{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client14{
	public static void main(String [] args){
		Parent14 obj = new Child14();
		obj.career();
		obj.marry();
	}
}


