class Client2{
	static void fun(int x){
		if(x==10){
			Demo obj = new Demo();
		}
	}
	public static void main(String [] args)throws InterruptedException{
		System.out.println("Start main");
		fun(10);
		Thread.sleep(5000);
		System.out.println("End main");
	}
}

class Demo{
	Demo(){
		System.out.println("Demo2 Constructor");
	}
	public void finalize(){
		System.out.println("Object gheun jatoy");
	}
}


