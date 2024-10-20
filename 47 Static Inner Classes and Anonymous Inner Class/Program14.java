class Outer14{
	static int x  = 10;
	int y = 20;
	static void run(){
		System.out.println("In static method");
	}
	void fun(){
		System.out.println("In non-static method");
	}
	static class Inner{
		static int x = 50;
		Inner(){
			System.out.println(x);
			System.out.println(Outer14.x);
			run();
		}
	}
}
/*	public static void main(String [] args){	
		Outer14.Inner obj = new Outer14.Inner();
	}
}*/


class Client {
	public static void main(String [] args){
		Outer14.Inner obj = new Outer14.Inner();
	}
}

