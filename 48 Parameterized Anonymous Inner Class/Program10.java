class Demo10{
	void fun(){
		System.out.println("in fun-Demo");
	}
}
class Outer{
	public static void main(String [] args){
		Demo obj = new Demo(){
			void fun(){
				run();
			}
			void run(){
				System.out.println("*** In run-Outer$1");
			}
		};
		obj.fun();
	}
}

