class Xyz{
	static void fun(){
		System.out.println("In Fun");
	}
}
class Demo{
	static void run(){
		System.out.println("In run");
	}
	public static void main(String [] args){
		run();
		Xyz.fun();
	}
}

