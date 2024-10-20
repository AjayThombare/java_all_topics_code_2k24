class Outer {
	int x = 10;
	Outer(){
		System.out.println("In Outer Constructor");
	}
	void fun(){
		System.out.println("In fun-Outer");
	}
	class Inner {
		Inner(){
			System.out.println("In Inner Constructor");
		}
	}
	void run(){
		System.out.println("In run-Outer");
	}
	public static void main(String [] args){
		Outer outObj = new Outer();
		Inner objInn = outObj.new Inner();
		System.out.println(outObj.x);
		outObj.run();
		outObj.fun();
	}
}

