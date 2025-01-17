class ThreadDemo extends Thread{
	static Thread mainThread = null;
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("In run");
			try{
				mainThread.join();
			}catch(Exception e){

			}
		}
	}
	public static void main(String [] args)throws InterruptedException{
		mainThread = Thread.currentThread();
		System.out.println(mainThread);
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		for(int i=0; i<10; i++){
			System.out.println("In main");
			obj.join();
		}
	}
}

