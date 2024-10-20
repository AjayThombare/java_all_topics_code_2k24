class Xyz{
	void fun(int x){
		System.out.println("In fun");
		System.out.println(x);
	}
}
class Demo{
	void run(float f){
		System.out.println("In run");
		System.out.println(f);

	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		obj1.run(20.5);

		Xyz obj2 = new Xyz();
		obj2.fun(10);
	}
}

