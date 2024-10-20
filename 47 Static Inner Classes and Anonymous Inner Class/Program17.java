class Parent17{
	void career(){
		System.out.println("Software Developer");
	}
}
class Child extends Parent17{
}
class Client{
	public static void main(String [] args){
		Parent17 obj = new Parent17();
		obj.career();
	}
}

