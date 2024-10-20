class Parent20{
	int marry(String str){
		System.out.println(str);
		return 10;
	}
}
class Child20 extends Parent20{
	float marry(String str){
		return 10.5f;
	}
}
class Client20{
	public static void main(String [] args){
		Parent20 obj = new Child20();
		obj.marry("Alia Bhat");
	}
}

		
