class Demo18{
	int y = 20;
	Demo18(){
		System.out.println("Constructor");
		System.out.println(y);
	}
	{
		System.out.println("Instance block");
	}
	void fun(){
		System.out.println("In non-static method");
	}
	public static void main(String [] args){
		Demo18 obj = new Demo18();
		obj.fun();
	}
}

