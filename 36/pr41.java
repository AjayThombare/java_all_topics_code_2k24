class Xyz{
	void fun(int x){
		System.out.println("In fun");
	}
}
class Demo{
	void run(float f){
		System.out.println("In run");
	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		obj1.run();

		Xyz obj2 = new Xyz();
		obj2.fun();
	}
}

