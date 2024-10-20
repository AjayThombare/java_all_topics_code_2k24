class Demo8{
	void fun(){
		System.out.println("In fun-Demo");
	}
	void run(){
		System.out.println("In run-Demo");
	}
}
class Outer8{
	public static void main(String [] args){
		Demo8 obj = new Demo8(){
			void fun(){
				System.out.println("In fun-Outer$1");
			}
			void run(){
				System.out.println("In run-Outer$1");
			}
		};
		obj.fun();
		obj.run();
	}
}




