class Demo16{
	void fun(int x){
		System.out.println("In fun ***");
	}
}
class Outer16{
	public static void main(String [] args){
		Demo16 obj = new Demo16();
		obj.fun();
	}
}

