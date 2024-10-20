class Demo21{
	void fun(String x){
		System.out.println("In fun");
	}
}
class Outer21{
	public static void main(String [] args){
		Demo21 obj = new Demo21();
		obj.fun("Shashi");
		obj.fun(new String("Shashi"));
	}
}


