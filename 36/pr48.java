class Demo{
	void fun(char x, char y){
		System.out.println("In fun");
		System.out.println(x);
		System.out.println(y);
	}
	void run (double a, float b){
		System.out.println("in run");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		obj1.fun('A','B');
		obj1.fun(65,66);
		/*obj1.run('R','S');
		obj1.run(10,20);
		obj1.run(10.5,20.5);
		obj1.run(10.5f,20.5f);
		obj1.run(10.5f,20);
		obj1.run(10.5f,20.5f);
		obj1.run(10.5,20.f);*/

	}
}

