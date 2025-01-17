class ThreadDemo implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class Client1{
	public static void main(String [] args){
		ThreadDemo td = new ThreadDemo();
		Thread t1 = new Thread(td);
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}
}

