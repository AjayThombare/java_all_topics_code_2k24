class Parent{
	int x = 10;
	int y = 20;
	Parent(){
		System.out.println("Parent constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child constructor");
	}
	public static void main(String [] args){
		Child cObj = new Child();
		System.out.println(cObj.x);
		System.out.println(cObj.y);
	}
}

