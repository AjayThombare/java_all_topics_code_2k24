class Parent21{
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child extends Parent21{
	/*void marry(){
		System.out.println("Disha Patni");
	}*/
}
class Client{
	public static void main(String [] args){
		Parent21 obj = new Child();
		obj.marry();
	}
}

