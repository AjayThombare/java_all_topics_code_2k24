class Parent20{
/*	void marry(){
		System.out.println("Alia Bhat");
	}*/
}
class Child extends Parent20{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client{
	public static void main(String [] args){
		Parent20 obj = new Child();
		obj.marry();
	}
}

