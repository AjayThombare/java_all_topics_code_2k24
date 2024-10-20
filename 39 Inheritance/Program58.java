class Parent {
	int x = 10;
	int y = 20;
	Parent(){
		System.out.println("Parent constructior");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child constructor");
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String [] args){
		Child cObj = new Child();
	}
}


