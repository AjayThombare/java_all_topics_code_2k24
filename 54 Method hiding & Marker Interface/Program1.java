class Parent1{
	private void fun(){
		System.out.println("in fun-Parent");
	}
}
class Child extends Parent1{
	void fun(){
		System.out.println("In fun-Parent");
	}

}
class Client{
	public static void main(String [] args){
		Parent1 obj = new Child();
		obj.fun();
	}
}

