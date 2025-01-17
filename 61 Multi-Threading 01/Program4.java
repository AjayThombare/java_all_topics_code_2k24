class ThreadDemo4 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++){
			System.out.println("In fun");
		}
	}
	public static void main(String [] args)throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		ThreadDemo4 t1 = new ThreadDemo4();
		t1.start();
		for(int i=1; i<=5; i++){
			System.out.println("Before Sleep");
		}
		Thread.sleep(2000);
		for(int i=1; i<=5; i++){
			System.out.println("In main");
		}
	}
}

