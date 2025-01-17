class ThreadDemo9 extends Thread{
	public void run(){

		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String [] args)throws InterruptedException{
		System.out.println("Strat main");
		System.out.println(Thread.currentThread().getName());
		ThreadDemo9 obj = new ThreadDemo9();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	
	}
}

