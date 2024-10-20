class Demo17{
	void fun(int x){
		System.out.println("In fun ***");
	}
}
class Outer17{
	public static void main(String [] args){
		Demo17 obj = new Demo17();
		obj.fun(10);
	}
}

