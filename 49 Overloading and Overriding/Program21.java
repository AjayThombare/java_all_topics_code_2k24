class Parent21{
	float marry(String str){
		System.out.println(str);
		return 10.5;
	}
}
class Child21 extends Parent21{
	int marry(String str){
		return 10;
	}
}
class Client21{
	public static void main(String [] args){
		Parent21 obj = new Parent21();
		obj.marry("Alia Bhat");
	}
}

