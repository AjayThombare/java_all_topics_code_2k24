class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
}
class Client{
	public static void main(String [] args){
		Child cObj = new Child();
		System.out.println("End main");
	}
}

