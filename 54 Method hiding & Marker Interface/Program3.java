class Parent3{
	final void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child3 extends Parent3{
	void fun(){
		System.out.println("In fun-Parent");
	}
}
class Client{
	public static void main(String [] args){
		Parent3 obj = new Child3();
	}
}

