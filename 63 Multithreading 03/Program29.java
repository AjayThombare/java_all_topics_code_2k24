class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run");
			try{
				join();
			}catch(Exception e){

			}
		}
	}
	public static void main(String [] args)throws InterruptedException{
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		for(int i=1; i<10; i++){
			System.out.println("In main");
			join();
		}
	}
}

