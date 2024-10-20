class Parent2 {
	void career(){
		System.out.println("Software engg");
	}
	void marry();
}
class Child2 extends Parent2{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client2{
	public static void main(String [] args){
		Parent2 obj = new Child2();
		obj.career();
		obj.marry();
	}
}



