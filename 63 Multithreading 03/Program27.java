class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("in run");
			try{
				Thread.sleep(2000);
			}catch(Exception ie){

			}
		}
	}
	public static void main (String [] args)throws InterruptedException{
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		for(int i=0; i<10; i++){
			System.out.println("In main");
			obj.join();
		}
	}
}

