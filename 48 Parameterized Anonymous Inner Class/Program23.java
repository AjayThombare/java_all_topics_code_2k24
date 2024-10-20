class Demo23{
	void fun(Object x){
		System.out.println("In fun");
		//System.out.println(x);
	}
}
class Outer23{
	public static void main(String [] args){
		Demo23 obj = new Demo23();
		obj.fun("Shashi");
		obj.fun(new String("Ajay"));
		obj.fun(new StringBuffer("Thombare"));
	}
}

