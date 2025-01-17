class Parent5{
	static void fun(){
		System.out.println("In fun-parent");
	}
}
class Child5 extends Parent5{

}
class Client5{
	public static void main(String [] args){
		Child5 obj = new Child5();
		obj.fun();
	}
}

