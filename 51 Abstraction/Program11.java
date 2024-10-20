abstract class Parent11{
	void career(){
		System.out.println("Software engg");
	}
	abstract void marry();
}
abstract class Child11 extends Parent11{

}
class Client11{
	public static void main(String [] args){
		Parent11 obj = new Parent11();
		Child11 obj1 = new Child11();
	}
}

