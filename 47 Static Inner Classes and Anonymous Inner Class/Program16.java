class Parent{
	void career(){
		System.out.println("Software Developer");
	}
}
class Child extends Parent{
}
class Client{
	public static void main(String [] args){
		Child obj = new Child();
		obj.career();
	}
}

