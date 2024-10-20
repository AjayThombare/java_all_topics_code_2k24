class FloatDemo{
	void fun(float f){
		System.out.println("In fun");
	}
	public static void main(String [] args){
		FloatDemo obj = new FloatDemo();
		obj.fun(10.5f);
		obj.fun('A');
		obj.fun(10);
		obj.fun(501);
		obj.fun(20.5);
	}
}

