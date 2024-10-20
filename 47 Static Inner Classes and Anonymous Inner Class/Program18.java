class Parent18{
	void career(){
		System.out.println("Software Developer");
	}
}
class Child extends Parent18{
}
class Client{
	public static void main(String [] args){
		Parent18 obj = new Child();
		obj.career();
	}
}

