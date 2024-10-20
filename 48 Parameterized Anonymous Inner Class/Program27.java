class Demo27{
	void fun(Object x){
		System.out.println("In fun");
		System.out.println(x);
	}
}
class Outer27{
	public static void main(String [] args){
		Demo27 obj = new Demo27();
		obj.fun(10.5f);
	}
}

