import java.util.concurrent.*;
class ThreadTask implements Runnable{
	int num = 0;
	ThreadTask(int num){
		this.num = num;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName() + "start-"+num);
		fun();
		System.out.println(Thread.currentThread().getName() + "end-"+num);
	}
	void fun(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ie){

		}
	}
}
class ThreadPoolDemo9{
	public static void main(String [] args){
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		for(int i=0; i<10; i++){
			ThreadTask task = new ThreadTask(i);
			threadPool.execute(task);
		}
		threadPool.shutdown();
	}
}

