class Demo4{
	void fun(){
		System.out.println("In fun");
	}
}
class DemoChild4 extends Demo4{
	void fun(){
		System.out.println("In fun DemoChild");
	}
	void run(){
		System.out.println("in run DemoChild");
	}
}
class Outer4{
	public static void main(String [] args){
		Demo4 obj = new DemoChild4(){};
	}
}


