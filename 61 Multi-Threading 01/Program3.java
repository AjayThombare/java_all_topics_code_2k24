class ThreadDemo3 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<=5; i++){
			System.out.println("In run");
		}
	}
	public static void main(String [] args)throws InterruptedException{

		System.out.println(Thread.currentThread().getName());
		ThreadDemo3 t1 = new ThreadDemo3();
		t1.start();
		
		Thread.sleep(2000);
		for(int i=1; i<=5; i++){
			System.out.println("In main");
		}

	}
}

