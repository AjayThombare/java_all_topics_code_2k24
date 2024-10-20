class MethodDemo{
	void fun(long x, double y){
		System.out.println("In fun");
	}
	public static void main(String [] args){
		MethodDemo obj = new MethodDemo();
		obj.fun('A','B');
		obj.fun(10,10.5);
		obj.fun(10,20.5f);
		obj.fun(10.5f,20.5);
		obj.fun(20.5,10.5f);
		obj.fun(210,10.5);
	}
}

