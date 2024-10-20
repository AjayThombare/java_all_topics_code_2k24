class Parent {
	int x = 10;
	int y = 20;
	Parent(){
		System.out.println("Parent constructor");
	}
}
class Child extends Parent{
	int x = 30;
	int y = 40;
	Child(){
		System.out.println("Child constructor");
	}
	public static void main(String [] args){
		Child cObj = new Child();
		System.out.println(cObj.super.x);
		System.out.println(cObj.super.y);
	}
}

