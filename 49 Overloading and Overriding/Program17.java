class Parent17{
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child17 extends Parent17{
	void marry(){
		System.out.println("Dish Patni");
	}
}
class Client17{
	public static void main(String [ ]args){
		Parent17 obj = new Child17();
		obj.marry();
	}
}



