class Demo9{
	Demo9()throws InterruptedException{
		System.out.println("In constructor");
		Thread.sleep(3000);
		System.out.println("End constructor");
	}
	public static void main(String [] args)throws InterruptedException{
		System.out.println("Start main");
		Demo9 obj = new Demo9();
		Thread.sleep(5000);
		System.out.println("End main");
	}
}

