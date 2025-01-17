class ThreadDemo extends Thread{
	public void run(){
		for(int i=1; i<6; i++){
			System.out.println("In fun");
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
			
			}
		}
	}
}
public class Program24{
	public static void main(String [] args)throws InterruptedException{
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		//Thread.yield();
		for(int i=1; i<11; i++){
			System.out.println("In main");
		}
	}
}

