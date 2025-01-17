class ThreadDemo extends Thread{
	public void run(){
		for(int i=1; i<6; i++){
			System.out.println("In fun");
			
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){
			
			}
		}
	}
}
public class Program25{
	public static void main(String [] args)throws InterruptedException{
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		obj.join();
		for(int i=1; i<11; i++){
			System.out.println("In main");
		}
	}
}

