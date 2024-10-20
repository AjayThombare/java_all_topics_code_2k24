abstract class Parent1{
	void career(){
		System.out.println("Software engg");
	}
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child1 extends Parent1{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client1{
	public static void main(String [] args){
		Parent1 obj = new Child1();
		obj.career();
		obj.marry();
	}
}

