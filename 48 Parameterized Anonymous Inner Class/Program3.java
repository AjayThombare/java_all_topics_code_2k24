class Demo3{
	void fun(){
		System.out.println("In fun");
	}
}
class DemoChild{
	void fun(){
		System.out.println("In fun DemoChild");
	}
	void run(){
		System.out.println("In run DemoChild");
	}
}
class Outer3{
	public static void main(String [] args){
		Demo3 obj = new DemoChild(){

		}
	}
}

