class Demo25{
	void fun(Object x){
		System.out.println("In fun");
	}
}
class Outer25{
	public static void main(String [] args){
		Demo25 obj = new Demo25();
		obj.fun(new Integer(10));
	}
}

