class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("In run");
			try{
				Thread.sleep(2000);
			}catch(Exception ie){
				System.out.println("Asach Exception");
			}
		}
	}
	public static void main(String [] args)throws InterruptedException{
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		Thread.currentThread().join();
		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	}
}

