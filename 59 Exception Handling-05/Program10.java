class Demo10{
	static throws InterruptedException{
		Thread.sleep(3000);
	}
	Demo10()throws InterruptedException{
		System.out.println("In constructor");
		Thread.sleep(3000);
		System.out.println("End constructor");
	}
	public static void main(String [] args){
		System.out.println("Start main");
		Demo10 obj = new Demo10();
		Thread.sleep(5000);
		System.out.println("End Main");
	}
}


