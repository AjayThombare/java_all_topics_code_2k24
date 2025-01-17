class ThreadDemo10 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String [] args)throws InterruptedException{
		System.out.println("Start main");
		System.out.println(Thread.currentThread().getName());
		ThreadDemo10 obj = new ThreadDemo10();
		obj.start();

		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName());

		}
	}
}

