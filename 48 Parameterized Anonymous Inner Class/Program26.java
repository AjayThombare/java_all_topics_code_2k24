class Demo26{
	void fun(Object x){
		System.out.println("In fun");
	}
}
class Outer26{
	public static void main(String [] args){
		Demo26 obj = new Demo26();
		obj.fun(10);
	}
}

