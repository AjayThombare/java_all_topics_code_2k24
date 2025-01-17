class ThreadDemo6 extends Thread{
	public static void main(String [] args)throws InterruptedException{
		System.out.println("Start main");
		System.out.println(Thread.currentThread().getName());
		ThreadDemo6 obj = new ThreadDemo6();
		obj.start();
	}
}

