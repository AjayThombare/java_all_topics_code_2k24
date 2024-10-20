class Demo18{
	void fun(int x){
		System.out.println("In fun");
	}
}
class Outer18{
	public static void main(String [] args){
		Demo18 obj = new Demo18();
			obj.fun('A');
		
	}
}


