class ThreadDemo extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon");
		}
		else{
			System.out.println("Normal");
		}
	}
}
public class Program15{
	public static void main(String [] arrgs){
		ThreadDemo obj1 = new ThreadDemo();
		ThreadDemo obj2 = new ThreadDemo();
		ThreadDemo obj3 = new ThreadDemo();
		obj2.setDaemon(true);

		obj1.start();
		obj2.start();
		obj3.start();

	}
}

