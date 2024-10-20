class Demo15{
	int x = 0;
	Demo15(int x){
		this.x = x;
		System.out.println("In constructor");
	}
	void fun(int x){
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String [] args){
		Demo15 obj = new Demo15(120);
		Demo15 obj1 = new Demo15(150);
		obj.fun(50);
		obj1.fun(60);
	}
}


