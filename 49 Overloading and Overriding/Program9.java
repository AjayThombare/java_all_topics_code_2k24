class Demo9{
	void fun(int x, float y){
		System.out.println("int-float");
	}
	void fun(float x, int y){
		System.out.println("float-int");
	}
	public static void main(String [] args){
		Demo9 obj = new Demo9();
		obj.fun(10.5f, 20.5f);
	}
}

