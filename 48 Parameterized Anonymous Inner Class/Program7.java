class Demo{
	void fun(){
		System.out.println("In fun Demo");
	}
	void run(){
		System.out.println("In run Demo");
	}
}
class DemoChild extends Demo{
	void run(){
		System.out.println("In run DemoChild");
	}
}

class Outer{
	public static void main(String [] args){
		Demo obj = new DemoChild(){
			void fun(){
				System.out.println("In fun-Outer$1");
			}
		};
		obj.fun();
		obj.run();
	}
}

