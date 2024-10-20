class Demo20{
	void fun(int x){
		System.out.println("In fun");
	}
}
class Outer20{
	public static void main(String [] args){
		Demo20 obj = new Demo20();
		obj.fun(10L);
	}
}

