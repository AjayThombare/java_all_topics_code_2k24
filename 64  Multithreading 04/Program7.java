class Demo{
	Demo(){
		System.out.println("Demo Constructor");
	}


	void fun(){
		System.out.println("In fun");
	}
	public void finalize(){
		System.out.println("In finalize");
	}
}
class Client7{
	public static void main(String [] args){
		System.out.println("Start main");
		
		Demo obj = new Demo();
		obj.fun();
		System.out.println("End main");
	}
}

