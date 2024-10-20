abstract class Parent16{
	void career(){
		System.out.println("Software engg");
	}
	public abstract void marry();
}
class Child16 extends Parent16{
	public void marry(){
		System.out.println("Alia Bhat");
	}
}
class Client16{
	public static void main(String [] args){
		Parent16 obj = new Child16();
		obj.career();
		obj.marry();
	}
}

