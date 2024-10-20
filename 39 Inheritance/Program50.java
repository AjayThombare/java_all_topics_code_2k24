class Parent{
	int x = 10;
	void fun(){
		System.out.println("In fun");
	}
}
class Child{

}
class Client{
	public static void main(String[] args){
		Parent pObj = new Parent();
		System.out.println(pObj.x);
		pObj.fun();
	}
}

