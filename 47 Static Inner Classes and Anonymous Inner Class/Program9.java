class Outer9{
	static int x = 10;
	int y = 20;
	static void run(){
		System.out.println("in static method");
	}
	void fun(){
		System.out.println("in non-staic method");
	}
	static class Inner{
		Inner(){
			System.out.println(x);
			run();
		}
	}
}
class Client{
	public static void main(String [] args){
		Outer.Inner obj = new Inner();
	}
}

	
