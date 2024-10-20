class Demo{
	Demo(){
		System.out.println("In constructur");
	}
	void fun(){
		System.out.println("In fun method");
	}
}
class ConstrDemo{
	public static void main(String [] args){
		System.out.println("Start maiin");
		Demo obj = new Demo();
		System.out.println("End main");
	}
}

