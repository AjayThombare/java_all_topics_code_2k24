class Demo12{
	void fun(){
		System.out.println("in fun-Demo");
	}
}
class Outer{
	public static void main(String [] args){
		new DemoChild(){
			void run(){
				System.out.println("In run-Outer$1");
			}
		}.run();
	}
}

