class Xyz{
	void fun(){
		System.out.println("In Fun");
	}
}
class Demo{
	void run(){
		System.out.println("In run");
	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		obj1.run();

		Xyz obj2 = new Xyz();
		obj2.fun();
	}
}

