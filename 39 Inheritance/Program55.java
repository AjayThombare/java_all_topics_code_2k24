class Parent{
	int x = 10;
	int y = 20;
	Parent(){
		System.out.println("parent constructor");
	}
}
class Child extends Parent{
	int x = 30;
	int y = 40;
	Child(){
		System.out.println("Child Constructor");
	}
	public static void main(String [] arrgs){
		Child cObj = new Child();
		System.out.println(cObj.x);
		System.out.println(cObj.y);
	}
}

