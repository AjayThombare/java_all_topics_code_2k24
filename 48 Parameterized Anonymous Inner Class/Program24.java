class Demo24{
	void fun(Object x){
		System.out.println("In fun");
	}
}
class Outer24{
	public static void main(String [] args){
		Demo24 obj = new Demo24();
		obj.fun(10);
		obj.fun(new Integer(10));
	}
}

