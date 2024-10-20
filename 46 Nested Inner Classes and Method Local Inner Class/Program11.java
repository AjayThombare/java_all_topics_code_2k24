class Outer11{
	class Inner{
		void run(){
			System.out.println("In run");
		}
	}
	void fun(){
		System.out.println("In fun");
	}
	public static void main(String [] args){
		Outer11 obj = new Outer11();
		obj.fun();
		Inner innerObj = obj.new Inner();
		innerObj.run();
	}
}

