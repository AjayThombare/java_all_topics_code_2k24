class Parent{
	int x = 10;
	void fun(){
		System.out.println("In fun");
	}
}
class Child extends Parent{

}
class Client{
	public static void amin(String [] args){
		Parent pObj = new Parent();
		System.out.println(x);
	}
}

