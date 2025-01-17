class ThreadDemo implements Runnable{
	public void run(){
		System.out.println("in run");
		System.out.println(Thread.currentThread().getName());
	}
}
class Client{
	public static void main(String [] args){
		ThreadDemo obj = new ThreadDemo();
		Thread t1 = new Thread(obj,"Shashi");
		t1.start();

		System.out.println(Thread.currentThread().getName());

	}
}


