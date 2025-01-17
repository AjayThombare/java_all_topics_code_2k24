class ThreadDemmo extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Client17{
	public static void main(String [] args)throws InterruptedException{
		ThreadDemo tm = new ThreadDemo();
		tm.start();

		for(int i=0; i<=10; i++){
			System.out.println("In main");
			Thread.sleep(2000);
		}
	}
}

