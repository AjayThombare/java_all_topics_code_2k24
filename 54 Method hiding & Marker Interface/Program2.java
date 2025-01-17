class Parent2{
	private void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child2 extends Parent2{
	private void fun(){
		System.out.println("In fun-Parent");
	}
}
class Client2{
	public static void main(String [] args){
		Parent2 obj = new Child2();
	}
}

