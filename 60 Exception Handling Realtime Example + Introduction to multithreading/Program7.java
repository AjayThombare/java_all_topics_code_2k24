class ThreadDemo7 extends Thread{
	void run(){

	}
	public static void main(String [] args)throws InterruptedException{
		System.out.println("Start main");
		System.out.println(Thread.currentThread().getName());
		ThreadDemo7 obj = new ThreadDemo7();
		obj.start();
	}
}

