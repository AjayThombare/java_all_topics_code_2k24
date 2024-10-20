class Parent19{
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child extends Parent19{
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client{
	public static void main(String [] args){
		Parent19 obj = new Child();
		obj.marry();
	}
}

