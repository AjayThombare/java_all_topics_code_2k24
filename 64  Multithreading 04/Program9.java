class Demo {
	Demo(){
		System.out.println("Demo Constructor");
	}
	void fun(){
		System.out.println("In fun");
	}
	public void finalize(){
		System.out.println("in finalize");
	}
}
class Client9{
	public static void main(String [] args)throws InterruptedException{
		System.out.println("Start main");
		Demo obj = new Demo();
		obj.fun();

		System.gc();
		Thread.sleep(2000);
		System.out.println("End main");
	}
}

