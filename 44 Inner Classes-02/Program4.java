class Outer{
	int x = 10;
	void fun(){
		System.out.println("in fun-Outer");
	}
	class Inner{
		Inner(){

		}
	}
	void run(){
		System.out.println("In run-Outer");
	}
	public static void main(String [] args){
		Outer obj = new Outer();
		System.out.println(obj.x);
		obj.fun();
		obj.run();
	}
}

