class Outer15{
	static int x = 10;
	int y = 20;
	static void run(){
		System.out.println("In static method");
	}
	void fun(){
		System.out.println("In non-static method");
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
		Outer15.Inner obj = new Outer15.Inner();
	}
}

