class Parent4{
	static void fun(){
		System.out.println("In fun-Parent");
	}
}
class Child4 extends Parent4{

}
class Client4{
	public static void main(String [] args){
		Parent4.fun();
	
	}
}

