class Outer12{
	class Inner{
		static void run(){
			System.out.println("In run");
		}
	}
	void fun(){
		System.out.println("In fn");
	}
	public static void main(String  [] args){
		Outer12 obj = new Outer12();
		obj.fun();
		Inner innerObj = obj.new Inner();
		innerObj.run();
	}
}

