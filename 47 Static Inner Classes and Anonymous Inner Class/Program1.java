class Outer1{
	static int x = 10;
	static void run(){
		System.out.println("In static method");
	}
	class Inner{
		int y = 20;
		void fun(){
			System.out.println("In fun method");
			System.out.println(x);
			run();
		}
	}
	public static void main(String [] args){
		Outer1 outObj = new Outer1();
       	     	Inner obj = outObj.new Inner();
	 	System.out.println(obj.y);
		obj.fun();
	}
}

