class Demo11{
	void fun(){
		System.out.println("in fun Demo");
	}
}
class Outer{
	public static void main(String [] args){
		Demo11 obj = new Demo11(){
			void run(){
				System.out.println("In run-Outer");
			}
		}.run();
		obj.fun();
	}
}

