class Demo{
	int x = 10;
	Demo(){
		System.out.println("in constructor");
		return();
	}
	void fun(){
		System.out.println("In fun method");
	}
}
class ConstrDemo{
	public static void main(String [] args){
		System.out.println("Start main");
		Demo obj = new Demo();
		System.out.println("End main");
	}
}


