class Demo19{
	void fun(short x){
		System.out.println("In fun *");
	}
}
class Outer19{
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun('A');
	}
}

